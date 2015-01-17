// Problem 1
// Find the sum of all the multiples of 3 or 5 below 1000.

println(
  Range(1, 1000)
    .filter(i => i % 3 == 0 || i % 5 == 0)
    .sum)