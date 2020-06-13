case class Fruit(name:String)
val apple=Fruit("apple")
val orange=Fruit("orange")
val kiwi=Fruit("kiwi")
val fruitBasket=List(apple,orange,kiwi,orange,kiwi,apple,kiwi,kiwi)

fruitBasket.filter((fruits:Fruit)=>fruits.name=="apple")

//Can also be written as
fruitBasket.filter(fruits=>fruits.name=="apple")

//Can also be written as
fruitBasket.filter(_.name=="apple")
//since fruits is used only once on RHS of arrow

//If fruits used multiple times on RHS of arrow
fruitBasket.filter(fruits=>fruits.name=="apple" || fruits.name=="orange")

//If we underscore with the above scenario, it will throw error
fruitBasket.filter(_.name=="apple" || _.name=="orange")