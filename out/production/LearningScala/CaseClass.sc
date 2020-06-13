case class Course(book:String, author:String)

val course1=Course("Python","Janani")
val course2=Course("Scala","Janani")

course1.book
course2.author

val course3=course2.copy(book="Spark")

course1
course2
course3