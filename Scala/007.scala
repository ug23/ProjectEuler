// Problem 7
// What is the 10 001st prime number?


import scala.math._

// def nextPrime(n: Int):Int = {
//   def hop(s:Int):Int = {
//     if(isPrime(s+2)) s+2
//     else hop(s+2)
//   }

// }

// def nthPrime(i: Int):Int = {
//   i match {
//     case 1 => 2
//     case 2 => 3
//     case n => {
//       nextPrime(nthPrime(n-1))
//     }
//   }

// ......
  
// }

// println("10001th prime is "+nthPrime(10001)+".")

// ひどいコードだったので下記コードの意味を考えることにする
// cf https://pavelfatin.com/scala-for-project-euler/

// takeWhile:条件文を満たしてる部分
// forall:すべてを満たしたらtrue

lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i => 
  ps.takeWhile(j => j * j <= i).forall(i % _ > 0))

val r = ps(10000)

println("10001th prime is "+ps(10000)+".")