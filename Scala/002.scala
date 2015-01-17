// Problem 2
// By considering the terms in the Fibonacci sequence 
// whose values do not exceed four million, 
// find the sum of the even-valued terms.

def fibList(f0: Int, f1: Int, lim: Int): List[Int] = {
  val f2 = f0 + f1
  if (f2 > lim) Nil else f2 :: fibList(f1, f2, lim)
}
def fibList(lim: Int): List[Int] = 1 :: 2 :: fibList(1, 2, lim)
val LIMIT = 4000000
println(fibList(LIMIT).filter(i => i % 2 == 0).sum)
