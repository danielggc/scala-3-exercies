
case class Account(name: String, password: String, age: Int)

object `ValidationsFlatMap ` {

    
    val  validName: Account => Option[Account] = 
        a => if( a.name.length() > 0 ) then 
            Some( a )
            else
                None
    val  validAge: Account => Option[Account] = 
        a => if( a.age  > 18  ) then 
            Some( a )
            else
                None

    val  validPassword: Account => Option[Account] = 
        a => if( a.password.length() > 0 ) then 
            Some( a )
            else
                None


    def validateAccounts( accounts:Seq[Account] ):Seq[ Option[ Account ] ] = 
        accounts.map ( e => Some(e)
        .flatMap( validAge )
        .flatMap( validName ) 
        .flatMap( validPassword )
        )
        
    @main
    def ValidationsRun () :Unit = 
        val accounts = Seq(
            Account("bucktrends", "1234", 18),
            Account("", "1234", 29),
            Account("bucktrends", "", 29),
            Account("bucktrends", "1234", 29)
            )
        validateAccounts( accounts ).foreach( println ) 
        
/* ressul:
    [info] running ValidationsRun 
        None
        None
        None
        Some(Account(bucktrends,1234,29))
 */
}
