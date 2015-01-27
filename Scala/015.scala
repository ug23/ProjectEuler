// Probrem 15
// Starting in the top left corner of a 2×2 grid, 
// and only being able to move to the right and down, 
// there are exactly 6 routes to the bottom right corner.
// How many such routes are there through a 20×20 grid?

// path : 40
// downs 20, rights 20
// => 40!/(20!*20!)

def fact(n: Int): BigInt = {
  def sub(i: Int, ans: BigInt): BigInt = {
    if (i == 1) ans
    else sub(i - 1, ans * i)
  }
  sub(n, BigInt("1"))
}

println( fact(40) / (fact(20) * fact(20)) )