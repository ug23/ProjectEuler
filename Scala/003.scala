import scala.math._

// implicit classでBigIntにsqrt関数を追加する
// cf. http://kmizu.hatenablog.com/entry/20120506/1336302407
implicit class AwesomeBigInt(self: BigInt) {
  def bsqrt: BigInt = BigInt(sqrt(self.doubleValue).ceil.toInt.toString)

  // 素因数分解の結果をListで返す
  // cf. http://d.hatena.ne.jp/a-san/20110107
  def primeFactors: List[BigInt] = {
    def sub(start: BigInt, n: BigInt): List[BigInt] = {
      if (start > n.bsqrt) {
        List(n)
      } else if (n % start == 0) {
        start :: sub(start, n / start)
      } else {
        sub(start + 1, n)
      }
    }
    sub(2, self)
  }
}

val prob = BigInt("600851475143")
prob.primeFactors.foreach(println)
println
println("Ans. " + prob.primeFactors.last)