// 1, 1, 2, 3, 5, 8, 13,...
// What is the first term in the Fibonacci sequence to contain 1000 digits?

val one = BigInt("1")

// f(2) = 2 のため添字はひとつ足して計算すること
val fib: Stream[BigInt] = one #:: fib.scanLeft(one)(_ + _)

// pow(1000)では1001桁になる
val thou = BigInt("10").pow(1000 - 1) 
val ans = fib.indexWhere(_ >= thou)
println(ans + 1)