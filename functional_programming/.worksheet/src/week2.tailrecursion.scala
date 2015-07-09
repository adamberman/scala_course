package week2

object tailrecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(173); 
  def factorial(n: Int): Int = {
  	def loop(acc: Int, n: Int): Int =
  		if (n==0) acc
  		else loop(acc * n, n - 1)
  	loop(1, n)
  };System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$0 = 
  factorial(4);System.out.println("""res0: Int = """ + $show(res$0))}
}

object exercise2 {
	def sum(f: Int => Int, a: Int, b: Int) = {
		def loop(a: Int, acc: Int): Int =
			if (a > b) acc
			else loop(a + 1, f(a) + acc)
		loop(a, 0)
	}
	sum(x => x * x, 3, 5)
}
