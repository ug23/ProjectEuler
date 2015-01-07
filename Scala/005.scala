// 1 〜 20までの最小公倍数を求めれば良い
// aとbの最小公倍数は a*b/gcd(a,b) で求められる

def gcd(a: Long, b: Long): Long =
  if (b == 0) a
  else gcd(b, a % b)

def lcm(a: Long, b: Long): Long =
  a * b / gcd(a, b)

println((1L to 20L).reduceLeft(lcm(_, _)))