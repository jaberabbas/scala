package com.learn.classes

@main
def main(): Unit= {
  val p1 = Point(10, 10)
  println(p1)
  val g = Greeting("Sunday", "2024").great("Scala")
  println(g)
}
