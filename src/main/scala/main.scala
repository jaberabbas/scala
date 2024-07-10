import com.learn.{Cat, Greeting, IntIterator, Mouse, PatternMatch, Pet, Point}

import scala.collection.mutable.ArrayBuffer

@main
def main(): Unit =

  println(PatternMatch().matchInt(1))
  println(PatternMatch().matchInt(5))
  val animals =  ArrayBuffer[Pet]().empty
  val kate = Cat("Kate")
  val miki = Mouse("Miki")
  animals.append(kate)
  animals.append(miki)
  animals.foreach(pet => println(pet.name))
  val intIterator = IntIterator(3)
  println("hasNext"  + intIterator.hasNext)
  println("next " + intIterator.next)
  println("next " + intIterator.next)
  println("next " + intIterator.next)
  for (i <- 0 until 3) {
    println("next " + intIterator.next)
  }

  val p1: Unit = Point(10, 10)
  println(p1)
  val g = Greeting("Sunday", "2024").great("Scala")
  println(g)
  val mydog = Dog()
  mydog.speak()
  mydog.tailMove()

  println("Hello world!")
  println(test("Scala"))
  println(square(3))
  println(age())
  defaultParam("John")


  def defaultParam(name : String, greeting : String = "Hello ") : Unit={
    println(s"$greeting$name")
  }
  def test(str: String) : String ={
    "Hello " + str
  }

  def square (x :Int): Int ={
    x * x
  }

  def age(): String =
    val age = Seq(20, 30, 40)
    s"the max age is ${age.max}"





