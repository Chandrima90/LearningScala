object arrayExample{
  val numerals = Array("I","II","III","IV","V")

  def main(args:Array[String]) = {
    for (i <-0 to numerals.length-1)
      //println(s"${i} - ${numerals(i)}")
      println(i + "-" + numerals(i))
  }
}