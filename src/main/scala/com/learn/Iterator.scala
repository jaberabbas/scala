package com.learn

trait Iterator[A]{
  def next: A
  def hasNext: Boolean
}

class IntIterator(to: Int) extends Iterator[Int]{
  private var current = 0;
  override def next: Int = {
    if (hasNext)
      current = current + 1
      current
    else
      0
  }

  override def hasNext: Boolean = {
    current < to
  }
}