package com.learn.forcomprehensions

class Foo {
  def foo(n: Int, v: Int) = {
    for i <- 0 until n
        j <- 0 until n if i + j == v
    yield (i, j)
  }
}
