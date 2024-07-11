package com.learn.iterator

@main
def main(): Unit= {
  val intIterator = IntIterator(3)
  println("hasNext" + intIterator.hasNext)
  println("next " + intIterator.next)
  println("next " + intIterator.next)
  println("next " + intIterator.next)
  for (i <- 0 until 3) {
    println("next " + intIterator.next)
  }

}