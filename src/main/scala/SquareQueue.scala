import scala.collection.mutable.ListBuffer

class SquareQueue(l:ListBuffer[Int]) extends Queue{
  for( i <-l.indices) { // Iterating the list
    l.update(i, l(i) * l(i))
  }

}

