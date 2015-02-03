import projecteuler._

object e014 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def collatz(n :Long): List[Long] = {
  	if (n == 1) List(1)
  	else if (Util.isEven(n)) n :: collatz(n / 2) else n :: collatz(3 * n + 1)
  }                                               //> collatz: (n: Long)List[Long]
  
  (1 to 1000000).map(x => (x -> collatz(x).length)).sortBy(_._2).last
                                                  //> res0: (Int, Int) = (837799,525)

}