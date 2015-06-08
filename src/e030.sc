object e030 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def longStream(n: Long): Stream[Long] = n #:: longStream(n + 1)
                                                  //> longStream: (n: Long)Stream[Long]\
  
  longStream(2).takeWhile(_ < Int.MaxValue).filter(x => x.toString().toList.map(y => Math.pow(y.asDigit.toDouble, 4).toInt).sum == x).sum
  //(2 to Int.MaxValue).filter(x => x.toString().toList.map(y => Math.pow(y.asDigit.toDouble, 4).toInt).sum == x).sum
}