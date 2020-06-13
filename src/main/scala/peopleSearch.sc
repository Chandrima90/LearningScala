case class people(name: String, city: String)

val person1 = people("Amal", "Noida")
val person2 = people("Vimal", "UP")

val allPerson = List(person1, person2)

def searchPeople(cityName: String) {
  for (e <- allPerson) {
    e match {
      case people(name, city) if city == cityName => e
      case _ => println("There are no person living in this city")
    }
  }
}


searchPeople("Noida")


searchPeople("Kolkata")