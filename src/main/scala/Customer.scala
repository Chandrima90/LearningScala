class Customer (name:String, address:String)

object Customer{
  def apply(name: String, address: String): Customer = new Customer(name, address)

  def apply(name: String): Customer = new Customer(name, "Address not known")
  
  def main (args: Array[String]): Unit ={
    Customer.apply("Bob","Italy")
    Customer("Rob","London")
    Customer("Jim")
  }
}
