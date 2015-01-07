// 回文数ならTrue
def isPalindrome(n: Int):Boolean = {
  val str = n.toString
    def sub(s:String):String = {
      val l = s.last
      s.head match {
        case l if s.length <= 3 => ""
        case l if s.length > 3 => sub(s.init.tail)
        case _ => s
    }
  }
  sub(str) == ""
}

val sm = 991199
println(isPalindrome(sm))