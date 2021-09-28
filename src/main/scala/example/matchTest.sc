/**
 * @see https://docs.scala-lang.org/ru/tour/pattern-matching.html
 *      https://coderoad.ru/28644861/В-scala-как-я-могу-использовать-pattern-match-для-сопоставления-списка-с
 */

val num: Int = 2 // x: Int = 2

num match { // res0: String = two
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case _ => "many"
}

def toName(num: Int): String = { // toName: (num: Int)String
  num match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}

toName(1) // res1: String = one


// использовать pattern match для сопоставления списка с заданной длиной
val arr: List[Int] = 1::2::Nil
arr match {
  case 1::Nil => "one"
  case 1::2::Nil => "two"
  case 1::2::3::Nil => "three"
  case _ => "more"
}