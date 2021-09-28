package example

import scala.annotation.tailrec

/**
 * @see http://progopedia.ru/example/fibonacci/122/
 *      https://stackoverflow.com/questions/9864497/generate-a-sequence-of-fibonacci-number-in-scala
 * fibonacci scala
 */
object Main1 extends App {
  println("Hello world 1")
  val fib7: Int = fibonacciTR(0, 1, 7)
  println(s"fib = ${fib7}")

  @tailrec
  def fibonacciTR(i1: Int, i2: Int, index: Int): Int = {
    if (index == 0) i1
    else fibonacciTR(i1, i1 + i2, index - 1)
  }
}
