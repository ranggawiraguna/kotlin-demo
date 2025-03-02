fun main(){
	print("Enter a Score (0-100)\t: ")

	val score 			= readln().toInt()
	var grade 			= ' '
	val passedValues 	= arrayOf('A','B','C')
	val failedValues 	= arrayOf('D','F')


	if(((0..100).contains(score))){
		if 		(score >= 90)	grade = 'A'
		else if (score >= 80)	grade = 'B'
		else if (score >= 70)	grade = 'C'
		else if (score >= 60)	grade = 'D'
		else					grade = 'F'
	}

	println("Grade\t\t\t: $grade")
	

	// When Expression
	print("Category\t\t: ")
	when(grade){
		'A'  -> println("Excellent")
		'B'  -> println("Very Good")
		'C'  -> println("Good")
		'D'  -> println("Bad")
		'F'  -> println("Very Bad")
		else -> {
			println("Invalid")
			println("Info\t\t\t: Please enter a score between 0-100")
			return
		}
	}


	// When Expression Multiple Option
	print("Result\t\t\t: ")
	when(grade){
		'A','B','C'	-> println("Passed")
		'D','F'  	-> println("Failed")
	}


	// When Expression In
	print("Result\t\t\t: ")
	when(grade){
		in passedValues		-> println("Passed")
		in failedValues  	-> println("Failed")
	}


	// When Expression Is (For Object Oriented Programming)
	print("Status\t\t\t: ")
	when(grade){
		is Char -> println("Valid")
		!is Char -> println("Invalid")
	}

	
	// When Expression Without Variable
	print("Message\t\t\t: ")
	when{
		score >= 70					-> println("Congratulations")
		grade in arrayOf('D','E')  	-> println("Try a Little More")
		grade == 'F'  				-> println("Please Study Harder")
		else 						-> println("Nothing")
	}
	
}