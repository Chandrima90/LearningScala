import com.sun.net.httpserver.Authenticator.Success

import scala.util.{Try, Success, Failure}

val employees = Set("Ram", "Shyam", "Jadu", "Madhu")

employees.find(_ == "Ram")
  //          .map(value => println(value))
  .getOrElse("paini")


employees.find(_ == "Ram") match {
  case Some(value) => println(s"Returned value ${value}")
  case None => println("Kichu pai ni")
}
//employees.find(_=="Frank").get

employees.find(_ == "Frank").getOrElse("This employee is not present")

//Error handling
val outcome = Try {
  val outcome = employees.find(_ == "Frank").get
  //  outcome.isSuccess
  //  outcome.isFailure
}
outcome match {
  case Success(value) => println("Employee found")
  case Failure(e) => println {
    "Not found" + e.getMessage
  }

}