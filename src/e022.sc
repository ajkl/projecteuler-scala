import scala.io.Source
import projecteuler._

object e022 {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def letterIndex(x: Char) = (('A' to 'Z').zip(1 to 26)).toMap.get(x)
                                                  //> letterIndex: (x#12409512: Char#1737)Option#1911[Int#1080]
  
  //println(letterIndex('A').getOrElse(0))
  def getWordScore(x: String) = x.toCharArray.toList.map(letterIndex(_).getOrElse(0)).sum
                                                  //> getWordScore: (x#12409075: String#11917675)Int#1080
  getWordScore("COLIN")                           //> res0: Int#1080 = 53
  
  println(Util.getCurrentDirectory)               //> /Users/ajkale/Downloads/eclipse 2/Eclipse.app/Contents/MacOS
  val wordList = Source.fromFile("/Users/ajkale/workspace/projecteuler/p022_names.txt" )
  											.getLines
  											.flatMap(_.split(","))
  											.toList
  											.sorted
  											.zipWithIndex
  											.map(x => getWordScore(x._1) * (x._2 + 1))
  											.sum
                                                  //> wordList  : Int#1080 = 871198282
  											
	
}