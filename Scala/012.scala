//Problem 12
// What is the value of the first triangle number
// to have over five hundred divisors?

def triangler(n: Int):BigInt = {
  def sub(i:Int,sum:BigInt = BigInt("0")):BigInt = {
    if(i==0) sum
    else sub(i-1,sum + BigInt(i.toString))
  }
  sub(n)
}

def countDivisor(n: BigInt): Int = {
  def sub() = {
    if()
  }
}

lazy val ts = Stream.from(1).map(triangler)

