object e004 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  /*def isPalindrome(n: Long): Boolean = {
	  def foo(n: Long): List[Int] = {
	  		if (n != 0) {
	  			(n % 10).toInt :: foo(n / 10)
	  		} else List()
	  }
	  val f = foo(n)
  	f.reverse.equals(f)
  }*/
  
  def isPalindrome(n: Long): Boolean = n.toString.reverse.equals(n.toString)
                                                  //> isPalindrome: (n: Long)Boolean
  
  (100 to 999).combinations(2).map(x => x(0) * x(1)).filter(x => isPalindrome(x)).max
                                                  //> res0: Int = 906609

}