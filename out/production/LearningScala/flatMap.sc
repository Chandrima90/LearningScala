val nestedList=List(List(1,2,3,4),List(5,6,7,8))

nestedList.map(aList=>aList.map(_+1))

nestedList.map(aList=>aList.map(_+1)).flatten

nestedList.flatMap(aList=>aList.map(_+1))


def toIntg(s:String):Option[Int]= {
  try {
    Some(s.toInt)
  }
  catch {
    case e: NumberFormatException => None
  }
}

val args=List("one","2","3","four","5","six")

args.flatMap(toIntg(_))

