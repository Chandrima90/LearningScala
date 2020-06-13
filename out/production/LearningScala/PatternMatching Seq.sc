val sequ=List(1,2,3,4,5)

sequ match{
  case List(a,b,_*)=>b
  case _=>println("Not found")
}