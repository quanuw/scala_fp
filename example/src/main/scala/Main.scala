import example.Lists

object Main extends App {
  println(Lists.max(List(1,3,2)))
  println(Lists.sum(List(1,3,2)))
  println(Lists.max(List(1,-3,2)))
  println(Lists.sum(List(1,-3,200)))
  println(Lists.sum(List()))
  println(Lists.max(List()))
  
}sub