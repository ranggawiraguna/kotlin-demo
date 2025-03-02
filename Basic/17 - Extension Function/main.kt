fun main(){
	val fullname = "rangga wiraguna"
	
	fullname.print()
	print(fullname.toTitleCase())
}

fun String.print() = println(this)

fun String.toTitleCase(): String {
	return this.split(" ").joinToString(" "){it.capitalize()}
}