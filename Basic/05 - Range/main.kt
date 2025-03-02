fun main(){
	// Range
	val range = 1..100

	println("Range\t\t\t\t: " + range)
	println("Range\t\t\t\t: " + range.toList().joinToString(", "))
	println("Range Count\t\t\t: " + range.count())
	println("Range Contain 10\t: " + range.contains(10))
	println("Range Contain 10\t: " + range.contains(11))
	println("Range Contain 1000\t: " + range.contains(1000))
	println("Range First\t\t\t: " + range.first)
	println("Range Last\t\t\t: " + range.last)
	println("Range Step\t\t\t: " + range.step)
	println()
	
	// Range Down
	val rangeDown = 100 downTo 1

	println("Range\t\t\t\t: " + rangeDown)
	println("Range\t\t\t\t: " + rangeDown.toList().joinToString(", "))
	println("Range Count\t\t\t: " + rangeDown.count())
	println("Range Contain 10\t: " + rangeDown.contains(10))
	println("Range Contain 10\t: " + rangeDown.contains(11))
	println("Range Contain 1000\t: " + rangeDown.contains(1000))
	println("Range First\t\t\t: " + rangeDown.first)
	println("Range Last\t\t\t: " + rangeDown.last)
	println("Range Step\t\t\t: " + rangeDown.step)
	println()

	// Range Step 
	val rangeStep7 = 1..100 step 7

	println("Range\t\t\t\t: " + rangeStep7)
	println("Range\t\t\t\t: " + rangeStep7.toList().joinToString(", "))
	println("Range Count\t\t\t: " + rangeStep7.count())
	println("Range Contain 10\t: " + rangeStep7.contains(10))
	println("Range Contain 11\t: " + rangeStep7.contains(11))
	println("Range Contain 1000\t: " + rangeStep7.contains(1000))
	println("Range First\t\t\t: " + rangeStep7.first)
	println("Range Last\t\t\t: " + rangeStep7.last)
	println("Range Step\t\t\t: " + rangeStep7.step)
	println()

	// Range Step from Other Range
	val rangeStep9 = rangeStep7 step 9 // rangeStep7.step(9)

	println("Range\t\t\t\t: " + rangeStep9)
	println("Range\t\t\t\t: " + rangeStep9.toList().joinToString(", "))
	println("Range Count\t\t\t: " + rangeStep9.count())
	println("Range Contain 10\t: " + rangeStep9.contains(10))
	println("Range Contain 11\t: " + rangeStep9.contains(11))
	println("Range Contain 1000\t: " + rangeStep9.contains(1000))
	println("Range First\t\t\t: " + rangeStep9.first)
	println("Range Last\t\t\t: " + rangeStep9.last)
	println("Range Step\t\t\t: " + rangeStep9.step)
	println()
}