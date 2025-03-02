fun main(){
	val stringUpper : (String) -> String = { it.uppercase() }
	val stringLower : (String) -> String = { it.lowercase() }

	// Calling Higher Order Function
	stringPrint("Rangga Wiraguna", stringUpper)
	stringPrint("Rangga Wiraguna", stringLower)
	println()
	
	// Calling Higher Order Function with Function as Return Value
	stringPrint("Rangga Wiraguna", stringTransform("upper"))
	stringPrint("Rangga Wiraguna", stringTransform("lower"))
	stringPrint("Rangga Wiraguna", stringTransform())
	println()
	
	// Calling Higher Order Function with Lambda Expression
	stringPrint("Rangga Wiraguna", { value:String -> value.uppercase() })
	stringPrint("Rangga Wiraguna", { value:String -> value.lowercase() })
	println()
	
	// Calling Higher Order Function with Lambda Expression (it)
	stringPrint("Rangga Wiraguna", { it.uppercase() })
	stringPrint("Rangga Wiraguna", { it.lowercase() })
	println()

	// Calling Higher Order Function with Trailing Lambda
	stringPrint("Rangga Wiraguna"){ it.uppercase() }
	stringPrint("Rangga Wiraguna"){ it.lowercase() }
	println()
}

// Higher Order Fuction (Function as Parameter)
fun stringPrint(value:String, transform:(String)->String){
	println("Value\t: ${transform(value)}")
}

// Higher Order Fuction (Function as Return Value)
fun stringTransform(type:String=""):(String)->String{
	return when(type){
		"upper" -> { value:String -> value.uppercase() }
		"lower" -> { value:String -> value.lowercase() }
		else 	-> { value:String -> value }
	}
}