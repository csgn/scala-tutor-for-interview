package core

object Main12 {
  def main(args: Array[String]): Unit = {
    class Box[A](var content: A)

    abstract class Animal:
      def name: String

    case class Cat(name: String) extends Animal
    case class Dog(name: String) extends Animal

    val myAnimal: Animal = Cat("Felix")

    val myCatBox: Box[Cat] = Box[Cat](Cat("Felix"))
    // val myAnimalBox: Box[Animal] = myCatBox




  }
}
