object e048 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def last10pow(n: Int, p: Int): Long = {
  	var res = 1L
  	for (i <- 1 to p) {
  		val prod = res * n.toLong
			res = prod % 10000000000L
  	}
  	res
  }                                               //> last10pow: (n: Int, p: Int)Long
  (1 to 1000).map(x => last10pow(x, x)).sum % 10000000000L
                                                  //> res0: Long = 9110846700
}