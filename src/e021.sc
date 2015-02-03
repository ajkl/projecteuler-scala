import projecteuler._

object e021 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def factors(x: Int): List[Int] = (1 to (x/2).toInt).filter(x % _ == 0).toList
                                                  //> factors: (x: Int)List[Int]
  def isAmicable(n: Int) = {
  	val f = factors(n).sum
  	if (f != n && factors(f).sum == n) true else false
  }                                               //> isAmicable: (n: Int)Boolean
  
  (0 to 10000).filter(isAmicable(_)).sum          //> res0: Int = 31626
}