package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

    println(countChange(4, List(1,2)))
    println(balance(":-)".toList))
    println(balance("())(".toList))
    println(balance("(if (zero? x) max (/ 1 x))".toList))
    println(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList)
)

  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c < 0 || r < 0) throw new IllegalArgumentException("c and r must be non-negative.")
      else if (c <= 0 || c == r) 1
      else pascal(c, r-1) + pascal(c-1, r-1)
    }
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def inner(xs: List[Char], open: Int, close: Int): Boolean = {
        if (xs.isEmpty) open == close
        // saw a close before an open parans
        else if (close > open) false
        else if (xs.head == '(') inner(xs.tail, open+1, close)
        else if (xs.head == ')') inner(xs.tail, open, close+1)
        else inner(xs.tail, open, close)
        }
      inner(chars, 0, 0)
    }

      
  /**
   * Exercise 3
   */
   // We can either use this coin or skip it
    def countChange(money: Int, coins: List[Int]): Int = {
      def inner(xs: List[Int], money: Int): Int = {
        if (money == 0) 1
        else if (money > 0 && !xs.isEmpty) inner(xs, money-xs.head) + inner(xs.tail, money)
        else 0
      }

      inner(coins, money)
    }

    
}
