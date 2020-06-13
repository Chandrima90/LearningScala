class Employee1 {var salary=0}

val john=new Employee1
val mary=new Employee1

john.salary
mary.salary

john.salary=100
john.salary
mary.salary=200
mary.salary


class Employee {
  private var salary = 0

  def setSalary(x: Int) {
    salary = x
  }

  def getSalary():Int= {
    salary
  }
}
  val him=new Employee
  him.setSalary(2000)
  him.getSalary()
