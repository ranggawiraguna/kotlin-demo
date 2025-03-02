fun main(){
	// Break
	var i = 0;
	while (true){
		if (i > 10) {
			break
		}		
		else {
			println("Index\t: $i")
			i++
		}
	}
	println()
	
	for (j in 1..100){
		if (j % 2 == 1) continue		
		else println("Index\t: $j")
	}
	println()
}