// Find the sum of the digits in the number 100!

def fact(n: Int): BigInt = {
  def sub(i: Int, ans: BigInt): BigInt = {
    if (i == 1) ans
    else sub(i - 1, ans * i)
  }
  sub(n, BigInt("1"))
}

println(fact(100).toString.map(c => c - '0').sum)