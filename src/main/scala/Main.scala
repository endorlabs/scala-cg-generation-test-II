import org.apache.commons.text.StringSubstitutor

class MergeSort {
  def mergeSort(list: List[Int]): List[Int] = {
    val n = list.length / 2
    if (n == 0) list // Base case: a list with 0 or 1 element is already sorted
    else {
      val (left, right) = list.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  private def merge(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
    case (Nil, _) => right
    case (_, Nil) => left
    case (leftHead :: leftTail, rightHead :: rightTail) =>
      if (leftHead < rightHead) leftHead :: merge(leftTail, right)
      else rightHead :: merge(left, rightTail)
  }
}

object MergeSortExample {
  def sort() : Unit = {
    val sorter = new MergeSort
    val list = List(38, 27, 43, 3, 9, 82, 10)
    val sortedList = sorter.mergeSort(list)
    println(sortedList.mkString("[", ", ", "]"))
  }
}

object TheApp {
  def main(args: Array[String]): Unit = {
    // Taken from app-java-demo
    val interpolator = StringSubstitutor.createInterpolator();
    val out = interpolator.replace("${script:javascript:java.lang.Runtime.getRuntime().exec('touch ./foo')}");
    System.out.println(out);

    MergeSortExample.sort()
  }
}