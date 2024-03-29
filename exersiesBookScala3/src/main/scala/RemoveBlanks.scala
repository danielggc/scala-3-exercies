object RemoveBlanks {
  
    def apply( path :String , compress:Boolean ,  numbers:Boolean ) :Seq[String ]= 
        for {
        
            ( line ,i ) <- scala.io.Source.fromFile( path ).getLines().toSeq.zipWithIndex
                if line.matches( """^\s*$"""  ) == false 
                    line2 =  if compress then line.trim.replace("\\s+", " ") 
                             else line 
                numline =  if  numbers then "%4d: %s".format(i+1, line2)
                            else line2

        } yield numline


    protected case class Args(
        compress: Boolean = false,
        numbers: Boolean = false,
        paths: Vector[String] = Vector.empty
        )
    protected val helpMessage = """
        |usage: RemoveBlanks [-h|--help] [-c|--compress] [-n|--numbers] file ...
        |where:
        | -h | --help
        Print this message and quit.
        | -c | --compress Compress whitespace.
        | -n | --numbers Print original line numbers, meaning output numbers will
        |
        skip the removed blank lines.
        | file ...
        One or more files to process.
        |""".stripMargin

    protected def help(messages: Seq[String], exitCode: Int) =
        messages.foreach(println)
        println(helpMessage)
        sys.exit(exitCode) 

    protected def parseParams(params2: Seq[String], args: Args): Args =
        params2 match
            case ("-h" | "--help") +: tail =>
                println(helpMessage)
                sys.exit(0)
            case ("-c" | "--compress") +: tail =>
                parseParams(tail, args.copy(compress = true))
            case ("-n" | "--number") +: tail =>
                parseParams(tail, args.copy(numbers = true))
            case flag +: tail if flag.startsWith("-") =>
              println(s"ERROR: Unknown option $flag")
              println(helpMessage)
                sys.exit(1)
            case path +: tail =>
                parseParams(tail, args.copy(paths = args.paths :+ path))
            case Nil => args

    def CompresType( params :Array[String] ):Unit=
        val Args( compress, numbers, paths ) =  parseParams( params.toSeq  , Args( ) )
        for
            path <- paths
            seq = s"\n== File: $path\n" +: RemoveBlanks(path, compress, numbers)
            line <- seq 
        do println ( line )
}

@main
def mainCompress():Unit =
    RemoveBlanks.CompresType( Array( "-n" , "-c" ,"/home/dgc7/data.txt"  )   )