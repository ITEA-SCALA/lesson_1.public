package example

object Hello extends Greeting with App {
  println(greeting) // hello

//  println(greeting.charAt(-1)) // StringIndexOutOfBoundsException
//  println(greeting.charAt(0)) // h
//  println(greeting.charAt(4)) // o
//  println(greeting.charAt(5)) // StringIndexOutOfBoundsException

  println(greeting.head) // h
  println(greeting.tail) // ello
}

trait Greeting {
  lazy val greeting: String = "hello"
}
