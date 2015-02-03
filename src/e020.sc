import projecteuler._

object e020 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  Util.factBigInt(100).toString.toList.map(_.asDigit).sum
                                                  //> res0: Int = 648
}