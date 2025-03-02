fun main(){
	// Closure (Dapat mengakses variabel yang berada pada parent scope nya)	
	val name = "Rangga Wiraguna"
	val greeting = { "Hello $name" }

	println(greeting())
	println()

	var counter = 0
	val incrementCounter = fun() { counter++ }
	val decrementCounter = fun() { counter-- }

	println("Counter\t: $counter")
	incrementCounter()
	println("Counter\t: $counter")
	incrementCounter()
	println("Counter\t: $counter")
	decrementCounter()
	println("Counter\t: $counter")
	decrementCounter()
	println("Counter\t: $counter")
	println()
}