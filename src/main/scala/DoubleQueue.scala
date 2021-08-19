
import scala.collection.mutable.ListBuffer

class DoubleQueue( l:ListBuffer[Int]) extends Queue {

  for (i <- l.indices) {
    l.update(i, 2 * l(i))

  }
}