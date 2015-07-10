package week2

object currying {
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if (a>b) 1
  	else f(a) * product(f)(a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x * x)(3, 4)                       //> res0: Int = 144
  
  def factorial(n: Int) = product(x => x)(1, n)   //> factorial: (n: Int)Int
  factorial(5)                                    //> res1: Int = 120
}