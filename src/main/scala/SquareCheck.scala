
import scala.collection.mutable.ListBuffer

object SquareCheck{
  def main(args:Array[String]): Unit = {

    val listOfElements= ListBuffer(1,2,3,4,5,6,7,8,9,10)
    println(listOfElements)
    val s = new DoubleQueue(listOfElements)

    s.dequeue(listOfElements)
    println(listOfElements)
    s.enqueue(listOfElements)
    println(listOfElements)

    new SquareQueue(listOfElements)
    println(listOfElements)

  }
}
