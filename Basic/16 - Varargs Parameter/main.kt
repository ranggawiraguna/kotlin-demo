fun main(){
	// Basic Varargs Function
	println(getTotal(1, 2, 3, 4, 5))
	println(getTotal(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
	
	// Varargs Function with Another Parameter
	printTotal("Range-5", 1, 2, 3, 4, 5)
	printTotal(name="Range-10", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
}

// Basic Varargs Function
fun getTotal(vararg numbers: Int): Int {
	var total = 0
	for (number in numbers) total += number	
	return total
}

// Varargs Function with Another Parameter
fun printTotal(name:String, vararg numbers:Int) {
	var total = 0
	for (number in numbers) total += number	
	println("$name Total\t: $total")
}
