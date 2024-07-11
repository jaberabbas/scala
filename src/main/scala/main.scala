import com.learn.classes.{Greeting, Point}

@main
def main(): Unit =
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





