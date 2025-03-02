fun main(){
	printSquareAround(5)
	printSquareArea(10)
	// calculate() // Error
}

fun printSquareAround(sideLength:Int) {	
	fun calculate() = sideLength * 4 // This is a local function, it cannot be called from outside function printSquareAround
	println("Square Around\t: ${calculate()}")
}

fun printSquareArea(sideLength:Int) {
	fun calculate() = sideLength * sideLength // This is a local function, it cannot be called from outside function printSquareArea
	println("Square Area\t\t: ${calculate()}")
}