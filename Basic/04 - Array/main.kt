// Array Definition
val empty	 	: Array<String> 	= arrayOf()
val members 	: Array<String> 	= arrayOf("John", "Paul", "George", "Ringo")
val values 		: Array<Int> 		= arrayOf(1, 2, 3, 4, 5)
val mixed 		: Array<Any> 		= arrayOf("John", 1, 2.0, true)

fun main(){
	// Array Getter
	printArrays()


	// Array Setter
	members[0] = "John Lennon"
	members.set(1, "Paul McCartney")
	values[0] = 10
	values.set(1, 20)
	mixed[0] = 1
	mixed.set(1, "John")
	mixed[2] = false
	mixed.set(3, 2.0)

	printArrays()

	
	// Array Nullable
	val employees : Array<String?> = arrayOfNulls(3)

	println("Employees\t: " + employees.joinToString(", "))
	employees[0] = "Rangga"
	employees[1] = "Awal"
	employees[2] = "Udin"
	println("Employees\t: " + employees.joinToString(", "))
}

fun printArrays(){
	println("Empty\t\t: " + empty.joinToString(", "))
	println("Members\t\t: " + members.joinToString(", "))
	println("Members-0\t: " + members[0])
	println("Members-1\t: " + members.get(1))
	println("Values\t\t: " + values.joinToString(", "))
	println("Values-0\t: " + values[0])
	println("Values-1\t: " + values.get(1))
	println("Mixed\t\t: " + mixed.joinToString(", "))
	println("Mixed-0\t\t: " + mixed[0])
	println("Mixed-1\t\t: " + mixed.get(1))
	println("Mixed-2\t\t: " + mixed.get(2))
	println("Mixed-3\t\t: " + mixed.get(3))
	println()
}