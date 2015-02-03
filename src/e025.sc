object e025 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def fib(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fib(b, a + b)
                                                  //> fib: (a: BigInt, b: BigInt)Stream[BigInt]
  val numDigits = 1000                            //> numDigits  : Int = 1000
  fib(1, 1).takeWhile(x => x.toString.length < numDigits).toList.length + 1
                                                  //> res0: Int = 4782
}