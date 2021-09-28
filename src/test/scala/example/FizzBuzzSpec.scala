package example

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  "FizzBuzz" should "equal to the passed number '1' should be result '1'" in {
    FizzBuzz(1) shouldBe "1"
  }

  "FizzBuzz" should "equal to the passed number '2' should be result '2'" in {
    FizzBuzz(2) shouldBe "2"
  }

  "FizzBuzz" should "equal to the passed number '3' should be result 'FIZZ'" in {
    FizzBuzz(3) shouldBe "FIZZ"
  }

  "FizzBuzz" should "equal to the passed number '5' should be result 'BUZZ'" in {
    FizzBuzz(5) shouldBe "BUZZ"
  }

  "FizzBuzz" should "equal to the passed number '12' should be result 'FIZZ'" in {
    FizzBuzz(12) shouldBe "FIZZ"
  }

  "FizzBuzz" should "equal to the passed value '13' assert result '13'" in {
    FizzBuzz(13) shouldBe "13"
  }

  "FizzBuzz" should "equal to the passed value '15' assert result 'FIZZBUZZ'" in {
    FizzBuzz(15) shouldBe "FIZZBUZZ"
  }
}
