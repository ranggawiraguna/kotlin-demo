// Constant Variable
const val APP 		= "Kotlin" 
const val VERSION	= "1" 

fun main(){
	// Mutable Variable
	var firstName 	= "Rangga"
	var lastName 	= "Wiraguna"

	println("Fullname\t\t: $firstName $lastName")
	
	lastName = "Wiraguna Rudiyanto"
	// lastName = 2006 // Error (Tipe data tidak sama)
	
	println("Fullname\t\t: " + "$firstName $lastName")
	println()


	// Mutable Variable
	val fullname = "Rangga Wiraguna"
	// fullname = "Rangga Wiraguna Rudiyanto" // Error	(Tidak dapat dirubah)
	println("Fullname\t\t: " + fullname)
	println()


	// Nullable Variable
	var username	: String? = null
	println("Username\t\t: " +  username)
	println("Username Length\t: " +  username?.length)
	
	username = "ranggawiraguna"
	println("Username\t\t: " +  username)
	println("Username Length\t: " +  username?.length)
	println()


	// Constant Variable
	println("Platform\t\t: $APP Version $VERSION")
	println()
}