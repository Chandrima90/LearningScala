case class trip(to:String)
case class car(model:String)
case class cash(amount:Int)
case class NoPrize()

val bucket=List(NoPrize(),trip("India"),car("Tesla"),NoPrize(),NoPrize(),cash(50000),car("Indica"),NoPrize(),NoPrize(),cash(10000),trip("Germany"))

import scala.util.Random

Random.shuffle(bucket).take(1)(0) match {
  case t:trip=>println(s"You have won a trip to ${t.to}")
  case c:car=>println(s"You have won ${c.model} car")
  case ca:cash=>println(s"You have won cash of amount ${ca.amount}")
  case n: NoPrize=>println("Better luck next time")
}