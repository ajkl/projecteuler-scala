import projecteuler._

object e015 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val gridSize: Long = 20                         //> gridSize  : Long = 20
  
	Util.factBigInt(BigInt(gridSize * 2)) / (Util.factBigInt(BigInt(gridSize)) * Util.factBigInt(BigInt(gridSize)))
                                                  //> res0: scala.math.BigInt = 137846528820
}