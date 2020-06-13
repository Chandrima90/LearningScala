def addNumber(num: Int) ={
if (num<0) 0
else num+1
}
addNumber(-5)
addNumber(99)
//addNumber("hi")

def product(num1: Int, num2:Int) ={
  if (num1==0 ||num2==0) 0
  else num1/num2
}
product(2,0)
product(20,2)