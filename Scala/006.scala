// first one hundred natural numbers
val fohnn = Range(1, 100 + 1)

// the sum of the squares
val totalSquares = fohnn.map(x => x * x).sum
println("the sum of the squares: " + totalSquares)

// the square of the sum
val totals = fohnn.sum * fohnn.sum
println("the square of the sum: " + totals)

println("Ans. " + Math.abs(totalSquares - totals))