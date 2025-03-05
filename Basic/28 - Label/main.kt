fun main(){
	for (x in 1..100) { print("=") }
	println()

	// Label for break operator
	loopI@ for (i in 1..5){
		loopJ@ for (j in 1..5){
			if (i > 3) {
				break@loopI
			} else {
				println("$i-$j")
			}
		}
	}

	for (x in 1..100) { print("=") }
	println()
	
	// Label for continue operator
	loopI@ for (i in 1..10){
		loopJ@ for (j in 1..5){
			if (i % 2 == 1) {
				continue@loopI
			} else {
				println("$i-$j")
			}
		}
	}

	for (x in 1..100) { print("=") }
	println()

	// Label for return operator
	stringFormatTransform("Rangga Wiraguna")funString@{ // With Label
		value : String -> for(i in 1..10){
			if (i == 5) return@funString // return only for a lambda function
			else println("Value\t: $value")
		}
	}	
	println("End of Function")

	for (x in 1..100) { print("=") }
	println()

	stringFormatTransform("Rangga Wiraguna"){ // Without Label
		value : String -> for(i in 1..10){
			if (i == 5) return // return for a main function
			else println("Value\t: $value")
		}
	}	
	println("End of Function")

	for (x in 1..100) { print("=") }
	println()
}

inline fun stringFormatTransform(value : String,  transform : (String) -> Unit) = transform(value) 