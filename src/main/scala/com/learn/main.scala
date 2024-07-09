import com.learn.{Greeting, Point}

@main
def main(): Unit = {
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


  def test(str: String) : String ={
    "Hello " + str
  }

  def square (x :Int): Int ={
    x * x
  }

  def age(): String =
    val age = Seq(20, 30, 40)
    s"the max age is ${age.max}"
}