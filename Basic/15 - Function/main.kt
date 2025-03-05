fun main(){
	// Basic Function
	printName()	
	println()
	
	// Function with Parameter
	printNameWithAge("Rangga Wiraguna Rudiyanto",25)
	printNameWithAge("Awal Udin",null)
	println()
	
	// Function with Default Argument
	printNameWithAgeAndStatus("Rangga Wiraguna Rudiyanto",25,"Single")
	printNameWithAgeAndStatus("Awal Udin")
	println()
	
	// Function Named Argument
	printNameWithAgeAndStatus(
		name = "Rangga Wiraguna Rudiyanto",
		status = "Single",
		age = 25,
	)
	println()

	// Function Return Value
	println(getNameWithAgeAndStatus("Rangga Wiraguna Rudiyanto",25,"Single"))
	println()

	// Single Expression Function
	printNameWithAgeAndStatusSingleExpression("Rangga Wiraguna Rudiyanto",25,"Single")
	println(getNameWithAgeAndStatusSingleExpression("Rangga Wiraguna Rudiyanto",25,"Single"))
}

// Basic Function
fun printName(){
	println("Rangga Wiraguna Rudiyanto")
}

// Function with Parameter
fun printNameWithAge(name:String, age:Int?){
	println("""$name (${if (age != null) age else "Unknown"})""")
}

// Function with Default Argument
fun printNameWithAgeAndStatus(name:String, age:Int?=null, status:String="Unknown"){
	println("""$name (${if (age != null) age else "Unknown"} - $status)""")
}

// Function Return Value
fun getNameWithAgeAndStatus(name:String, age:Int?=null, status:String="Unknown") : String{
	return """$name (${if (age != null) age else "Unknown"} - $status)"""
}

// Single Expression Function
fun printNameWithAgeAndStatusSingleExpression(name:String, age:Int?=null, status:String="Unknown") = println("""$name (${if (age != null) age else "Unknown"} - $status)""")
fun getNameWithAgeAndStatusSingleExpression(name:String, age:Int?=null, status:String="Unknown") : String = """$name (${if (age != null) age else "Unknown"} - $status)"""