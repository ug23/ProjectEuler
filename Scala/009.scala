// Problem 9
// There exists exactly one Pythagorean triplet
// for which a + b + c = 1000. Find the product abc.

import scala.math._

// 005より
def gcd(a: Int, b: Int): Int ={
  if (b == 0) a
  else gcd(b, a % b)
}

def sqrtToInt(n:Int):Int = ceil(sqrt(n)).toInt

def isCoprime(p:Seq[Int]):Boolean = gcd(p(0),p(1)) == 1



// a+b+c == 1000 , a=m^2-n^2, b=2mn, c=m^2+n^2
// a+b+c = (m^2-n^2)/2 + mn + (m^2 + n^2)/2
//       = m^2 +mn = 1000

val pair = Range(1,1000,2).toSeq.combinations(2)
val coprimer = pair.filter(p=>isCoprime(p)).
coprimer.foreach(println)