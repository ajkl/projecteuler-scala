import projecteuler._

object e010 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  (2 to 2000000).map(_.toLong).filter(Util.isPrime(_)).sum
                                                  //> res0: Long = 142913828922
}