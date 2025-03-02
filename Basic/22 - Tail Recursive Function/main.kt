fun main(){
	print("Enter a Number\t\t: ")
	val value = readln().toInt()

	println("Factorial for $value\t: " + factorial(value))
}

// Tail Recursive Function (Pemanggilan dirinya sendiri sampai batasi tertentu, dalam hal ini sampai n == 1, namun hasil perkalian tidak ditumpuk, melainkan langsung dihitung, sehingga tidak memakan memori yang besar)
tailrec fun factorial(value:Int, total:Int=1):Int {
	return when (value){
		1 -> total
		else -> factorial(value-1, total*value)
	}
}