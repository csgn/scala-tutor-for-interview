package core

import scala.util.Random

object Main9 {
  def main(args: Array[String]): Unit = {

    object CustomerID:
      def apply(name: String) = s"$name--${Random.nextLong()}"
      def unapply(customerID: String): Option[String] =
        val arr = customerID.split("--")
        if arr.tail.nonEmpty then Some(arr.head) else None


    val custId1 = CustomerID("csgn")
    custId1 match
      case CustomerID(name) => println(name)
      case _ => println("coudl not extract a CustomerID")


    val custId2 = CustomerID("devcsgn") // CustomerID.apply("devcsgn")
    val CustomerID(name) = custId2 // CustomerID.unapply(custId2)
    println(name)

  }
}
