
object e005 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  Range(20, Int.MaxValue).find{ x => Range(11, 20).forall(x % _ == 0) }
                                                  //> res0: Option[Int] = Some(232792560)
}