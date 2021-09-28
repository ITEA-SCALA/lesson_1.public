package example

import org.scalatest.{FlatSpec, Matchers}

class FibonacciSpec extends FlatSpec with Matchers {

  "Fibonacci" should "equal to the passed number '0' should be result '0'" in {
    Fibonacci(0) shouldBe 0
  }

  "Fibonacci" should "equal to the passed number '1' should be result '1'" in {
    Fibonacci(1) shouldBe 1
  }

  "Fibonacci" should "equal to the passed number '2' should be result '1'" in {
    Fibonacci(2) shouldBe 1
  }

  "Fibonacci" should "equal to the passed number '3' should be result '2'" in {
    Fibonacci(3) shouldBe 2
  }

  "Fibonacci" should "equal to the passed number '4' should be result '3'" in {
    Fibonacci(4) shouldBe 3
  }

  "Fibonacci" should "equal to the passed value '5' assert result '5'" in {
    Fibonacci(5) shouldBe 5
  }

  "Fibonacci" should "equal to the passed value '6' assert result '8'" in {
    Fibonacci(6) shouldBe 8
  }

  "Fibonacci" should "equal to the passed value '7' assert result '13'" in {
    Fibonacci(7) shouldBe 13
  }

  "Fibonacci" should "equal to the passed value '8' assert result '21'" in {
    Fibonacci(8) shouldBe 21
  }
}
