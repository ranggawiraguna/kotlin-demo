fun main(){
	print("Enter a Number\t\t: ")
	val value = readln().toInt()

	println("Factorial for $value\t: " + factorial(value))
}

// Recursive Function (Pemanggilan dirinya sendiri sampai batasi tertentu, dalam hal ini sampai n == 1, sehingga jika dilihat perkalian akan semakin menumpuk sebanyak n kali)
fun factorial(n:Int):Int = if(n == 1) 1 else n * factorial(n-1)