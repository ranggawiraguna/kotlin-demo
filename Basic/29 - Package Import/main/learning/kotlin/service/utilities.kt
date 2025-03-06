package com.learning.kotlin.service

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
fun printNameWithAgeAndStatusSingleExpression(name:String, age:Int?=null, status:String="Unknown") = """$name (${if (age != null) age else "Unknown"} - $status)"""
fun getNameWithAgeAndStatusSingleExpression(name:String, age:Int?=null, status:String="Unknown") : String = """$name (${if (age != null) age else "Unknown"} - $status)"""