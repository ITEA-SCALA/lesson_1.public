import scala.annotation.tailrec

// Native Fibonacci
def fib(number: Int): Int = {
  number match {
    case 0 => 0
    case 1 => 1
    case _ => fib(number - 2) + fib(number - 1)
  }
}

fib(0) // res0: BigInt = 0
fib(1) // res1: BigInt = 1
fib(2) // res2: BigInt = 1
fib(3) // res3: BigInt = 2
fib(4) // res4: BigInt = 3
fib(5) // res5: BigInt = 5
fib(6) // res6: BigInt = 8
fib(7) // res7: BigInt = 13
fib(8) // res8: BigInt = 21

(0 to 10).foreach(num => print(fib(num) + " ")) // 0 1 1 2 3 5 8 13 21 34 55

fib(10) // res10: Int = 55


// Tail recursive Fibonacci
//def fibTail(number: Int): BigInt = {
//  @tailrec
//  def f(num: Int, acc1: BigInt, acc2: BigInt): BigInt = num match {
//    case 0 => acc1
//    case 1 => acc2
//    case _ => f(num - 1, acc2, acc1 + acc2)
//  }
//
//  f(number, 0, 1)
//}

def fibTail(number: Int): BigInt = {
  @tailrec
  def f(num: Int, acc1: BigInt, acc2: BigInt): BigInt = {
    num match {
      case 0 => acc1
      case 1 => acc2
      case _ => f(num - 1, acc2, acc1 + acc2)
    }
  }

  f(number, 0, 1)
}

(0 to 20).foreach(num => print(fibTail(num) + " "))

fibTail(90) // res2: BigInt = 2880067194370816120


// Другой способ реализации Фибоначчи - определить последовательность, которая будет храниться в «ленивой» коллекции, такой как Scala Stream
// Используя метод scan, scan (1) (_ + _) генерирует Stream,
// каждому из его элементов последовательно назначается сумма двух предыдущих элементов.
// Поскольку потоки «ленивы», ни одно из значений элемента в определенном fibStream не будет оцениваться до тех пор, пока элемент не будет запрошен.
val fibStream: Stream[BigInt] = 0 #::fibStream.scan(BigInt(1))(_ + _) // fibStream: Stream[BigInt] = Stream(0, ?)

fibStream(90) // res13: BigInt = 2880067194370816120


// Memoization using mutable Map
def memoize[K, V](f: K => V): K => V = { // memoize: [K, V](f: K => V)K => V
  val cache = scala.collection.mutable.Map.empty[K, V]
  k => cache.getOrElseUpdate(k, f(k))
}

val fibM: Int => BigInt = memoize(n => n match { // fibM: Int => BigInt = <function>
  case 0 => 0
  case 1 => 1
  case _ => fibM(n-2) + fibM(n-1)
})

fibM(90) // res14: BigInt = 2880067194370816120
