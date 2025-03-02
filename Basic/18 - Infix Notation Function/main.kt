fun main(){
	println("5 add 3\t: " + (5 add 3))
	println("8 add 8\t: " + (8 add 8))
	println()
	"Name\t: Rangga" printRepeated 3
	"Name\t: Kamal" printRepeated 2
}

infix fun Int.add(x: Int): Int {
	return this + x
}

infix fun String.printRepeated(x: Int) {
	for (i in 1..x) println(this)
}