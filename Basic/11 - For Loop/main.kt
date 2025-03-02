fun main(){
	// For in Range
	for (name in 1..10){
		println("Index\t: $name")
	}
	println()
	
	// For in Array
	for (name in arrayOf("John", "Doe", "Jane")){
		println("Name\t: $name")
	} 
	println()

	// For in Array with Index
	for ((index, name) in arrayOf("John", "Doe", "Jane").withIndex()){
		println("Name\t: $name (${index+1})")
	}
}