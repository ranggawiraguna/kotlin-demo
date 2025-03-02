fun main(){
	// Definition Lambda Expression
	val add : (Int,Int)->Int = {a: Int, b: Int -> a + b}
	val sub	: (Int,Int)->Int = {a: Int, b: Int -> a - b}

	// Shorter Lambda Expression
	val mul	= {a: Int, b: Int -> a * b}
	val div	= {a: Int, b: Int -> a / b}

	// Lambda Expression (Multiple Statement)
	val sum = { start: Int, end: Int ->
		var total = 0
		for (i in start..end) total += i
		total // Default Return Value
	}
	
	// Method References (Lambda from Existing Function)
	val total = ::getTotal

	// Keyword {it} only for one parameter and Deinition Lambda Expression
	val stringUpper : (String) -> String = { it.uppercase() }
	val stringLower : (String) -> String = { it.lowercase() }
	val stringPrint : (String) -> Unit = { println("Print\t\t\t: $it") }

	println("Addition\t\t: ${add(10, 5)}")
	println("Subtraction\t\t: ${sub(10, 5)}")
	println("Multiplication\t: ${mul(10, 5)}")
	println("Division\t\t: ${div(10, 5)}")
	println("Sum\t\t\t\t: ${sum(1, 10)}")
	println("Total\t\t\t: ${total(arrayOf(1, 2, 3, 4, 5))}")
	println("Upper\t\t\t: ${stringUpper("Hello World")}")
	println("Lower\t\t\t: ${stringLower("Hello World")}")
	stringPrint("Hello World")
}

fun getTotal(numbers: Array<Int>): Int {
	var total = 0
	for (number in numbers) total += number	
	return total
} 