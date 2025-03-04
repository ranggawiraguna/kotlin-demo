fun main(){
	// Inline Function (Reduce the overhead of function call for Higher Order Function)
	// Lambda will duplicate the code in the function
	for(i in 1..10){
		println(stringFormat{"Rangga Wiraguna($i)"})
	}
	println()
	for(j in 1..10){
		println(stringFormatTransform("Rangga Wiraguna($j)"){it.uppercase()})
		println(stringFormatTransform("Rangga Wiraguna($j)"){it.lowercase()})
	}
	println()
}

inline fun stringFormat(value : () -> String) : String = "Value\t: ${value()}" 
inline fun stringFormatTransform(value : String,  transform : (String) -> String) : String = "Value\t: ${transform(value)}" 