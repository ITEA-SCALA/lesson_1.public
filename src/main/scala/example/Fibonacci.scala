package example

import scala.annotation.tailrec

object Fibonacci {
  def apply(number: Int) = {
    new Fibonacci()
//      .fib(number)
      .fibTail(number)
  }
}


class Fibonacci {
  // Native Fibonacci
  def fib(number: Int): Int = {
    number match {
      case 0 => 0
      case 1 => 1
      case _ => fib(number - 2) + fib(number - 1)
    }
  }

  // Tail recursive Fibonacci
  def fibTail(number: Int): BigInt = {
    @tailrec
//    def f(num: Int, acc1: BigInt, acc2: BigInt): BigInt = {
    def f(num: Int, acc1: BigInt = 0, acc2: BigInt = 1): BigInt = {
      num match {
        case 0 => acc1
        case 1 => acc2
        case _ => f(num - 1, acc2, acc1 + acc2)
      }
    }

//    f(number, 0, 1)
//    f(number, acc2 = 1, acc1 = 0)
    f(number)
  }
}