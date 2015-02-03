import projecteuler._

object e012 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def nums(n: Long): Stream[Long] = ((n*(n+1))/2).toLong #:: nums(n + 1)
                                                  //> nums: (n: Long)Stream[Long]
  
  nums(1).find(x => Util.factors(x).length * 2 > 500).toList
                                                  //> res0: List[Long] = List(76576500)
  
}