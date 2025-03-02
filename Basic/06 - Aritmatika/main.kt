fun main(){
	// Aritmatika
	var a = 10
	var b = 5

	println("a\t\t: $a")
	println("b\t\t: $b")
	println("a + b\t: ${a + b}")
	println("a - b\t: ${a - b}")
	println("a * b\t: ${a * b}")
	println("a / b\t: ${a / b}")
	println("a % b\t: ${a % b}")
	println()

	// Augmented Assignment
	var value = 10

	println("Value\t\t: $value")
	value += 10
	println("Value += 10\t: $value")
	value -= 5
	println("Value -= 5\t: $value")
	value *= 3
	println("Value *= 3\t: $value")
	value /= 9
	println("Value /= 9\t: $value")
	value %= 3
	println("Value %= 3\t: $value")
	println()

	// Unary Operator
	var number = 15
	var numberNegative = -20
	var boolean = true

	println("Number\t\t\t\t: $number")
	println("Number++\t\t\t: ${number++}")
	println("Number\t\t\t\t: $number")
	println("Number--\t\t\t: ${number--}")
	println("Number\t\t\t\t: $number")
	println("++Number\t\t\t: ${++number}")
	println("Number\t\t\t\t: $number")
	println("--Number\t\t\t: ${--number}")
	println("Number\t\t\t\t: $number")
	println("Number Negative\t\t: $number")
	println("Boolean\t\t\t\t: $boolean")
	println("Boolean Negation\t: ${!boolean}")
	println()
}