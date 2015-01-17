// Problem 5
// What is the smallest positive number that is 
// evenly divisible(no remainder) by all of the numbers from 1 to 20?


// 1 〜 20までの最小公倍数を求めれば良い
// aとbの最小公倍数は a*b/gcd(a,b) で求められる

def gcd(a: Long, b: Long): Long =
  if (b == 0) a
  else gcd(b, a % b)

def lcm(a: Long, b: Long): Long =
  a * b / gcd(a, b)

println((1L to 20L).reduceLeft(lcm(_, _)))