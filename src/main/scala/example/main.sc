import java.time.LocalDate
import java.util.UUID
import scala.runtime.Nothing$

val list1 = List(1, 2, 3)

val list2 = 1 :: 2 :: 3 :: Nil

val list3 = Nil.::(3).::(2).::(1)


val now: LocalDate = LocalDate.now()

def getDayAndMonth(date: LocalDate) = {
  (date.getMonthValue, date.getDayOfMonth)
}

val thisIsTuple = (1, 2, "", now)

val a1 = thisIsTuple._1
val a2 = thisIsTuple._2

val (id, parentId, method, date) = thisIsTuple

val (id, _, _, date) = thisIsTuple


val userRow = (1, 2, "", now)

val address = ("Kiev", "Tupoleva", 11, 2)
val addressUSA = ("Kiev", 11, "Tupoleva", 2)

val (city, street, build, num) = address
def getAddress (address: (String, String, Int, Int)) = ???


case class User(id: UUID, name: String, pets: List[String])

val user = User(UUID.randomUUID(), "Anton", List("Alex"))
println(user.name)
user.copy(name = "Alex")
println(user.name)

case class Address(street: String, buildingNumber: Int)

def patternMatching(sex: String): Int = sex match {
  case "man" => 1
  case "woman" => 2
  case _ => 0
}

patternMatching("???")

def userPm(u: User): String = u match {
//  case User(id, name, pets) => name + id.toString
//  case User(id, name, _) => name + id.toString
  case User(id, name, _) if name.isEmpty => "defaultName"
  case User(id, "Anton", _) => "hey Anton"
  case User(_, name, _) => name
  case u @ User(_, _, _) => u.name
//  case s: String
  case _ => "N/A"
} // throw Exception

//def nothing: Unit = ???

def nothing: Unit = {
  ()
}

def nothing2(i: Int) : Unit = {
  if (i % 2 == 0) println("positive")
//  else ()
  ()
}

val user2: AnyRef = User(UUID.randomUUID(), "", List.empty)

def someMethod(): AnyRef =
  user2

//def testAnyRef(v: AnyRef): Unit = v match {
//  case long: Long => println(long) // v instanceOf Long
//  case integer: Int => println(integer)
//  case _ => ()
//}

user.==(user2) // user.equals(user2)
user == user2
user != user2
user eq user2





case class A() {

  override def toString = ???

}

//def x = Nothing
def x(): Nothing = ??? // Exception


var i1: User = null
var i2: User = _
//var i3: Null =

//i3 == null

case class Pet(name: String, age: Int)

val tuple = Pet("Alexa", 5)

val maybeTuple: Option[(UUID, String, List[String])] = User.unapply()

val u1: Option[User] = Option(user)






