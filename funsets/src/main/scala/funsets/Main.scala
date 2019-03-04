package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  println(map(singletonSet(2), (x: Int) => 2 * x))
}
