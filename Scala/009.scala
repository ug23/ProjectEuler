// Problem 9
// There exists exactly one Pythagorean triplet
// for which a + b + c = 1000. Find the product abc.

import scala.math._

def sq(x: Long) = x * x

// 差が奇数になる[1,1000]の範囲の自然数の組を用意
val pairs = Range(1, 1000 + 1).combinations(2).toSeq
  .filter(p => (p(1) - p(0)) % 2 == 1)

// 上の自然数の組から三つ組をつくる
// (m,n) => (m^2 - n^2, 2mn, m^2+n^2)
val triplets = pairs.map(p =>
  Seq(sq(p(1).toLong) - sq(p(0).toLong),
    2 * p(0).toLong * p(1).toLong,
    sq(p(1).toLong) + sq(p(0).toLong)))
  .filter(s => s.sum == 1000)

val ans = triplets.head
println("(a,b,c) = (" + ans.mkString(",") + ")")
println("Ans: abc = " + ans.product)