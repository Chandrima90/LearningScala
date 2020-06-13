class Directory {
  private val numbers = scala.collection.mutable.Map(
    "A" -> "1234",
    "B" -> "5678",
    "C" -> "5689",
    "D" -> "9875"
  )

  def apply(name: String) = {
    numbers.get(name)
  }

  def update(name: String, number: String): Unit = {
    numbers.update(name, number)
  }

  override def toString: String = numbers.toString

  def update(num: Int, areaCode: String) {
    numbers.foreach(entry => {
      if (entry._2.startsWith(num.toString))
        numbers(entry._1) = entry._2.replace(num.toString, areaCode)
    })
  }
}

object Directory {
  def main(args: Array[String]): Unit = {
    val yp = new Directory()
    println(yp)
    yp("A") = "9999" //need not use update method explicitly
    println("Phn number for A is :" + yp("A")) //same for apply method

    yp(56) = "7777"
    println(yp)
  }
}
