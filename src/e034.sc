import projecteuler._
object e034 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val longMax = Long.MaxValue                     //> longMax  : Long#2325 = 9223372036854775807
  
  val factMap = (0 to 9).map(x => x -> Util.factorial(x)).toMap
                                                  //> factMap  : scala#27.collection#2728.immutable#5800.Map#7424[Int#1080,Long#23
                                                  //| 25] = Map(0 -> 1, 5 -> 120, 1 -> 1, 6 -> 720, 9 -> 362880, 2 -> 2, 7 -> 5040
                                                  //| , 3 -> 6, 8 -> 40320, 4 -> 24)
  
  def sumFact(n: Long): Long = n.toString.map(_.asDigit).toList.map(x => factMap.get(x).getOrElse(1).asInstanceOf[Long]).sum
                                                  //> sumFact: (n#16954995: Long#2325)Long#2325
 
  //sumFact(145).sum
  def stream(i: Long = 1): Stream[Long] = i #:: stream(i + 1)
                                                  //> stream: (i#16955568: Long#2325)Stream#1500228[Long#2325]
  
  Util.factorial(7)                               //> res0: Long#2325 = 5040\
  stream(1).takeWhile { x => x <= longMax }.filter(x => x.toString.toList.contains("9")).length
	//stream(1).takeWhile { x => x <= longMax }.filter(x => x == sumFact(x)).sum
}