// Probrem 10
// Find the sum of all the primes below two million.

import scala.math._

// 007より無限素数リスト
lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i => 
  ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

// 有限にしてLongにしてあげる
val underTM = ps.takeWhile(_ <= 2000000).toSeq.map(_.toLong)

println("Ans : "+underTM.sum)