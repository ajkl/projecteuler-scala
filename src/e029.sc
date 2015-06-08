object e029 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  ((2 to 100) ++ (2 to 100)).combinations(2).toList.map(x => List(Math.pow(x(0), x(1)), Math.pow(x(1), x(0)))).flatten.distinct.length
                                                  //> res0: Int#1080 = 9183
  
}