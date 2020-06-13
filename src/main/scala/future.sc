import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

val fut = Future {
  Thread.sleep(10000); 21 + 21
}

fut.isCompleted

fut.value

val salary = Future {
  Thread.sleep(20000); 4000
}
val bonus = 500

val SalaryWithBonus = salary.map(value => value + bonus)

SalaryWithBonus

val productPrice = Future {
  150
}
val productTax = Future {
  8
}

val finalPrice = for {
  price <- productPrice
  tax <- productTax
} yield price + tax

finalPrice

val salaryLarge = salary.filter(s => s > 3000)

salaryLarge