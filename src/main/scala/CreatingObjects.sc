object Person
{
  val arr = List(1,2,3,4,5)
  def apply (firstName: String, lastName:String)=new Person(firstName, lastName)
  def apply(idx: Int): Int = arr(idx)

}

class Person(firstName: String, lastName:String)
{
  def getName:String=firstName + " " + lastName
}

val jim=Person("Jim","Carey")
jim.getName
Person(2)