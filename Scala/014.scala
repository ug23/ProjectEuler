// Problem 14
// The following iterative sequence is defined 
// for the set of positive integers:

// n → n/2 (n is even)
// n → 3n + 1 (n is odd)

// Which starting number, under one million, produces the longest chain?
// NOTE: Once the chain starts the terms are allowed to go above one million.

// メモ化用のmutableなMap
val memorizer = scala.collection.mutable.Map.empty[Long, Long]

// 対象のnをもらって保持しておく
// nに対してコラッツの関数を適用する
// 適用先がn以下になったらストップ
// nの遷移回数は最後
def trace(i: Long): Unit = {
  def collatz(n: Long): Long = {
    n match {
      case 1 => 1
      case n if memorizer.contains(n) => memorizer(n)
      case n if n % 2 == 0 => collatz(n / 2) + 1
      case n if n % 2 == 1 => collatz(3 * n + 1) + 1
    }
  }
  memorizer += (i -> collatz(i))
}

(1L to 1000000L).foreach(trace)
println("Ans. " + memorizer.maxBy(_._2)._1)