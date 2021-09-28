package example

object FizzBuzz {
  def apply(number: Int) = new FizzBuzz(number).toString
}


class FizzBuzz(num: Int) {

  override def toString = {
//    if (num % 15 == 0) "FIZZBUZZ"
//    else if (num % 3 == 0) "FIZZ"
//    else if (num % 5 == 0) "BUZZ"
//    else s"$num"

    (num % 3, num % 5) match {
      case (0, 0) => "FIZZBUZZ"
      case (0, _) => "FIZZ"
      case (_, 0) => "BUZZ"
      case _ => s"$num"
    }
  }
}