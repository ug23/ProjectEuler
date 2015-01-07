// 回文数ならtrue
def isPalindrome(n: Int): Boolean = {
  // 両端から1個ずつ検証していく方法を取ったが、
  // 結局のところ、逆転したものと一致していることを確認したほうが良かった
  // def mirror(s: String): String = {
  //   val l = s.last
  //   s.head match {
  //     case l if s.length <= 3 => ""
  //     case l if s.length > 3 => mirror(s.init.tail)
  //     case _ => s
  //   }
  // }
  // mirror(n.toString) == ""

  val str = n.toString
  str == str.reverse
}

println("Ans. " +
  Range(999,900-1,-1).combinations(2).map(i => i.product)
    .filter(i => isPalindrome(i)).max)

// (0 to 1000000).foreach(i => println(isPalindrome(i)))
// => real 0m4.148s user  0m2.237s sys 0m1.387s