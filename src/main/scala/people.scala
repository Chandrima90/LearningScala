import scala.io.StdIn

object people extends App {

  case class People(name: String, city: String)

  class Country {
    private var ps: List[People] = List()

    def addPeople(people: People): Country = {
      ps = people :: ps
      this
    }

    def searchPeople(cityname: String) = {
      ps.filter(_.city == cityname)
    }
  }


  val India = new Country

  println("What do you want to do? \n1. Add people \n2. Search people")
  var choice:Int=scala.io.StdIn.readInt()

  if (choice==1) {
    println("Enter the number of persons you want to add: ")
    var num: Int = scala.io.StdIn.readInt()

    (1 to num).foreach(idx => {
      println(s"${idx} > Enter Name,City: ")
      val Array(name, city) = scala.io.StdIn.readLine().split(",")
      India.addPeople(People(name, city))
    })
    
  }
  else {
    println("Enter the city to check: ")
    val cityName: String =
    scala.io.StdIn.readLine()
    println(India.searchPeople(cityName))
  }
}

