package example

import java.time.LocalDate

object Main extends App {

//  Main.::5

  println(Main.##)
//  println(Main.)

  val list1 = List(1, 2, 3)
  val list2 = 1 :: 2 :: 3 :: Nil  // rewrive to "normal" form
  val list3 = Nil.::(3).::(2).::(1)

  val i = -5

//  def unary_- Main
  42.unary_+

  val now: LocalDate = LocalDate.now()

  def getDayAndMonth(date: LocalDate) = {
    (date.getMonth, date.getDayOfMonth)
  }

}
