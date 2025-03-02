fun main(){
	print("Enter a Score (0-100)\t: ")
	val score = readln().toInt()

	// Return If
	println("Status\t\t\t: " + getStatusScore(score))

	// Return When
	println("Grade\t\t\t: " + getGradeScore(score))
}

// Return If
fun getStatusScore(score:Int) : String{
	return if(score >= 70) {
		"Passed"
	} else {
		"Failed"
	}
}

// Return When
fun getGradeScore(score:Int) : Char {
	return when {
		score >= 90 -> 'A'
		score >= 80 -> 'B'
		score >= 70 -> 'C'
		score >= 60 -> 'D'
		else 		-> 'F'
	}
}