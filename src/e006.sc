object e006 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  Math.pow((1 to 100).sum, 2).toLong - (1 to 100).map(Math.pow(_, 2)).sum.toLong
                                                  //> res0: Long = 25164150
}