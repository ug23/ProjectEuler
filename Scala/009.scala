import scala.math._

val pair = Range(1,1000).toSeq.combinations(2)

// 004より
def gcd(a: Int, b: Int): Int ={
  if (b == 0) a
  else gcd(b, a % b)
}

def isCoprime(p:Seq[Int]):Boolean = gcd(p(1),p(0)) == 1
def pythagorable(p:Seq[Int]):Boolean =   p(1) * p(1) + p(0) * p(1) == 500

// a+b+c == 1000 , a=m^2-n^2, b=2mn, c=m^2+n^2
// a+b+c = m^2-n^2 + 2mn + m^2 + n^2 = 2(m^2 +mn) == 1000

val coprimer = pair.filter(p=>isCoprime(p))
coprimer.foreach(println)