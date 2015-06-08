package projecteuler

object Util {
  
  def isPrime(n: Long): Boolean =
    (2 to (Math.sqrt(n)).toInt).find(n % _ == 0).isEmpty
    
  def isFactor(n: Long, factor: Long): Boolean = n % factor == 0
                                                  //> isFactor: (n: Long, factor: Long)Boolean
  def primeFactors(n: Long): List[Long] = {
    (2 to (Math.sqrt(n)).toInt)
      .find(n % _ == 0)
      .map(x => x.toLong :: primeFactors(n / x)).getOrElse(List(n))
  }             
  
  def square(x: Long): Long = x * x
  
  def isEven(n: Long): Boolean = n % 2 == 0
  
  def factors(n: Long): List[Long] = {
    (1L to (Math.sqrt(n)).toLong).filter(n % _ == 0).toList
  }  
  
  def factorial(n : Long): Long = if (n == 0) 1 else (1L to n).product
  
  def factBigInt(n: BigInt) = {
    def factHelper(n: BigInt, acc: BigInt): BigInt = {
      if (n == 1) acc
      else factHelper(n - 1, acc * n)
    }
    factHelper(n, 1)
  } 
  
  def getCurrentDirectory = new java.io.File( "." ).getCanonicalPath
  
}