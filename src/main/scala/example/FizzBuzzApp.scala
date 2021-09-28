package example

object FizzBuzzApp {

  def main(arg: Array[String]): Unit = {
    val res = (1 to 100)
      .map( FizzBuzz(_) )
      .mkString("\n")

    println(res)
  }
}
