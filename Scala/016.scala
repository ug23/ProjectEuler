// Problem 16
// What is the sum of the digits of the number 2^1000 ?

// 自前でpow書いてたけどライブラリにありました
val powered = BigInt("2").pow(1000)
val ans = powered.toString.map(i => i.toInt - '0').sum
println(ans)