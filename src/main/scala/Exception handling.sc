def converter1(txt:String): Either[String,Int]={
  try{
    Right(txt.toInt)
  } catch {
    case e:NumberFormatException=>Left("Error: "+e.getMessage)
  }
}

val fivetoInt=converter1("5")
val hellotoInt=converter1("hello")