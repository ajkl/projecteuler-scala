object e001 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //solution 1
  var sum = 0                                     //> sum  : Int = 0
  val validNums:List[Int] = for( i <- List.range(1, 1000) if i%3 == 0 || i%5 == 0 ) yield i
                                                  //> validNums  : List[Int] = List(3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25, 27
                                                  //| , 30, 33, 35, 36, 39, 40, 42, 45, 48, 50, 51, 54, 55, 57, 60, 63, 65, 66, 69
                                                  //| , 70, 72, 75, 78, 80, 81, 84, 85, 87, 90, 93, 95, 96, 99, 100, 102, 105, 108
                                                  //| , 110, 111, 114, 115, 117, 120, 123, 125, 126, 129, 130, 132, 135, 138, 140,
                                                  //|  141, 144, 145, 147, 150, 153, 155, 156, 159, 160, 162, 165, 168, 170, 171, 
                                                  //| 174, 175, 177, 180, 183, 185, 186, 189, 190, 192, 195, 198, 200, 201, 204, 2
                                                  //| 05, 207, 210, 213, 215, 216, 219, 220, 222, 225, 228, 230, 231, 234, 235, 23
                                                  //| 7, 240, 243, 245, 246, 249, 250, 252, 255, 258, 260, 261, 264, 265, 267, 270
                                                  //| , 273, 275, 276, 279, 280, 282, 285, 288, 290, 291, 294, 295, 297, 300, 303,
                                                  //|  305, 306, 309, 310, 312, 315, 318, 320, 321, 324, 325, 327, 330, 333, 335, 
                                                  //| 336, 339, 340, 342, 345, 348, 350, 351, 354, 355, 357, 360, 363, 365, 366, 3
                                                  //| 69, 370, 372, 375, 378, 380, 381, 384, 385, 387, 390, 393, 395, 396, 399, 40
                                                  //| 0, 402, 405, 408, 410, 4
                                                  //| Output exceeds cutoff limit.
  validNums.foldLeft(0)(_ + _)                    //> res0: Int = 233168
  
  //solution 2
  (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).sum
                                                  //> res1: Int = 233168
  
}