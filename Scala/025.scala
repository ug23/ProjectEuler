// What is the first term in the Fibonacci sequence to contain 1000 digits?


val one = BigInt("1")
val fib: Stream[BigInt] = one #:: fib.scanLeft(one)(_ + _)
val thou = BigInt("10").pow(1000)
val ans = fib.filter(_ <= thou).last
println(ans)