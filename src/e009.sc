import projecteuler._

object e009 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  (1 to 1000).combinations(2)
  .filter(x => x(0) + x(1) < 1000)
  .filter{ x => {val csq: Long = x(0)*x(0) + x(1)*x(1)
  							 val csqrt: Long = Math.sqrt(csq).toLong
  							 if (csq == csqrt * csqrt && x(0) + x(1) + csqrt == 1000) true else false
  							}
  				}
  .map(x => x(0) * x(1) * (1000 - x(0) - x(1)))
  .toList                                         //> res0: List[Int] = List(31875000)
  
}