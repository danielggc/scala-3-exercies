import cats.implicits.*
import cats.data.*
import cats.data.Validated.*
import scala.collection.View.Empty


case class ValidLoginForm(userName: String, password: String)

sealed trait LoginValidation:
    def error :String 


case class Empty( name :String ) extends  LoginValidation:
    val error = s"the fild name : [$name ] can`t empty "


case class TooShort( name :String , n:Int ) extends  LoginValidation :
    val error = s"The $name field must have at least $n characters"


case class BadCharacters(name: String) extends LoginValidation:
    val error: String = s"The $name field has invalid characters"
    


object LoginFormValidatorNec :
    
    type V[T] = ValidatedNec[ LoginValidation , T ]
    
    def nonEmpty( field : String ,name :String ):V[String] = 
        if field.length > 0 then  field.validNec
        else Empty( name ).invalidNec
    
    def notTooShort(  field:String, name :String, n :Int ):V[String] =
        if field.length >= n then field.validNec
        else TooShort( name  , n ).invalidNec
    
    def goodCharacters( field:String , name :String ):V[String] = 
        val re = raw".*\s..*".r
        if re.matches( field ) == false then field.validNec
        else BadCharacters( name ).invalidNec

    def apply( userName:String , password :String ): V[ValidLoginForm] = 
        (
            nonEmpty(userName, "user name"),
            notTooShort(userName, "user name", 5),
            goodCharacters(userName, "user name"),
            nonEmpty(password, "password"),
            notTooShort(password, "password", 5),
            goodCharacters(password, "password")
        ).mapN{
            (userName , _ ,_ ,password ,_ ,_ )  => ValidLoginForm( userName, password )
        }
end LoginFormValidatorNec




@main def TryLoginFormValidatorNec =
    //println( LoginFormValidatorNec("", "") )
    assert(LoginFormValidatorNec("", "") ==
        Invalid(Chain(
            Empty("user name"), TooShort("user name", 5),
            Empty("password"), TooShort("password", 5)
            )
        )
    )

    assert(LoginFormValidatorNec("1234", "6789") ==
        Invalid(Chain(
            TooShort("user name", 5),
            TooShort("password", 5)
            )   
        ))
    
    
    //println( LoginFormValidatorNec("12345", "") )
    assert(LoginFormValidatorNec("12345", "") ==
            Invalid(Chain(
            Empty("password"), TooShort("password", 5))))

    assert(LoginFormValidatorNec("123 45", "678 90") ==
            Invalid(Chain(
            BadCharacters("user name"), BadCharacters("password"))))

    assert(LoginFormValidatorNec("12345", "67890") ==
            Valid(ValidLoginForm("12345", "67890")))
    
end TryLoginFormValidatorNec



