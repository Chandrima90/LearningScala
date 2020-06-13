case class Book(title:String, year:Int, author:String, isbn:Int)

val book1=Book("a",2012,"aa",123)
val book2=Book("b",2016,"bb",321)
val book3=Book("c",2019,"cc",456)

book1 match {
  case Book(title,year, author,_)=>println(s"$title is wriiten by $author in the year $year")
  case _=>println("No book found")
}

book2 match {
  case Book(_,_,author,_)=>author
  case _=>"No book found"
}