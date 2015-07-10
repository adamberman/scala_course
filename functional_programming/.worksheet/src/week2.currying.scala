package week2

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(140); 
  def product(f: Int => Int)(a: Int, b: Int): Int = {
  	if (a>b) 1
  	else f(a) * product(f)(a + 1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(28); val res$0 = 
  product(x => x * x)(3, 4);System.out.println("""res0: Int = """ + $show(res$0))}
}
