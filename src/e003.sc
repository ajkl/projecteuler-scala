import projecteuler._

object e003 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //unit test
  assert(Util.isPrime(23))
  assert(!Util.isPrime(21))

  Util.isPrime(5)                                 //> res0: Boolean = true

  Util.primeFactors(20L)                          //> res1: List[Long] = List(2, 2, 5)
  Util.primeFactors(600851475143L).last           //> res2: Long = 6857
  //(2 to (Math.sqrt(20)).toLong)

}