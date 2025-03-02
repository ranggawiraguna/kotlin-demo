fun main(){
	// Selection if
	print("Enter a Score (0-100)\t: ")

	val score = readln().toInt()

	print("Grade\t\t\t: ")
	if(((0..100).contains(score))){
		if (score >= 90){
			println("A")
		} else if (score >= 80){
			println("B")
		} else if (score >= 70){
			println("C")
		} else if (score >= 60){
			println("D")
		} else {
			println("F")
		}
	} else {
		println("Invalid Score")
	}


}