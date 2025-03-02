fun main(){
	// Anonymous Function
	val stringPrint = fun(value:String, transform:(String)->String){
		if(value.isBlank()) {
			println("Value\t\t: Empty") 
		} else {
			println("Value\t\t: ${transform(value)}")
		}
	}

	// Anonymous Function in parameter
	stringPrint("Rangga Wiraguna", fun(value:String):String { return value.uppercase() })
	stringPrint("Rangga Wiraguna", fun(value:String):String { return value.lowercase() })
}