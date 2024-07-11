package com.learn.forcomprehensions

@main
def main(): Unit = {
  Foo().foo(10, 10).foreach {
    (i, j) => println(s"($i, $j) ") // prints (1, 9) (2, 8) (3, 7) (4, 6) (5, 5) (6, 4) (7, 3) (8, 2) (9, 1)
  }

  val userBase: Seq[User] = List(
    User("Travis", 28),
    User("Kelly", 33),
    User("Jennifer", 44),
    User("Dennis", 23))
  val twentySomethings = {
    for user <- userBase if user.getAge >= 20 && user.getAge < 30
      yield user.getName // i.e. add this to a list
  }
  twentySomethings.foreach(user => println(user))
}