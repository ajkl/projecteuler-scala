object e016 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  (1 to 1000).map(_ => 2).foldLeft(BigInt(1))((m, n) => m * n).toString.toList.map(_.asDigit).sum
                                                  //> res0: Int = 1366
}