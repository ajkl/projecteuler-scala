import projecteuler.Util

object e007 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def numStream(a: Long): Stream[Long] = if(Util.isPrime(a)) {a #:: numStream(a + 1)} else numStream(a + 1)
                                                  //> numStream: (a: Long)Stream[Long]
  numStream(2).take(10001).last                   //> res0: Long = 104743
}