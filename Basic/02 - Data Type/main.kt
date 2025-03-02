fun main(){
	// Integer Number
	var age 		: Byte 	= 10
	var height 		: Int 	= 170
	var distance 	: Short = 2000
	var balance 	: Long 	= 100000000L

	println("Age\t\t\t\t\t: " + age)
	println("Height\t\t\t\t: " + height)
	println("Distance\t\t\t: " + distance)
	println("Balance\t\t\t\t: " + balance)
	println()

	// Floating Point Number
	var value 		: Float 	= 98.8F
	var radius 		: Double 	= 271.6271

	println("Value\t\t\t\t: " + value)
	println("Radius\t\t\t\t: " + radius)
	println()


	// Literal
	var decimalLiteral 		: Int 	= 100
	var hexadecimalLiteral 	: Int 	= 0x0FF
	var binaryLiteral 		: Int 	= 0b00001011

	println("Decimal Literal\t\t: " + decimalLiteral)
	println("Hexadecimal Literal\t: " + hexadecimalLiteral)
	println("Binary Literal\t\t: " + binaryLiteral)
	println()


	// Underscore in Number (For Separator)
	var price 	: Int 	= 1_000_000
	var phone 	: Long 	= 628_123_456_789L

	println("Price\t\t\t\t: " + price)
	println("Phone\t\t\t\t: " + phone)
	println()


	// Number Conversion
	var ageConversion 		: Int 	= age.toInt()
	var heightConversion 	: Byte 	= height.toByte()

	println("Age Conversion\t\t: " + ageConversion)
	println("Height Conversion\t: " + heightConversion)
	println()


	// Character
	var letter	: Char	= 'A'
	var symbol 	: Char 	= '@'

	println("Letter\t\t\t\t: " + letter)
	println("Symbol\t\t\t\t: " + symbol)
	println()


	// Boolean
	var isTrue	: Boolean 	= true
	var isFalse : Boolean 	= false

	println("isTrue\t\t\t\t: " + isTrue)
	println("isFalse\t\t\t\t: " + isFalse)
	println()

	// String
	var name 		: String 	= "Rangga Wiraguna"

	println("Name\t\t\t\t: " + name)
	println()

	// Multiline String
	var address1 	: String 	= """
		Jl. Raya Kedungwaringin
		Kec. Bojong Gede
		Kab. Bogor
		16710
	"""
	var address2 	: String 	= """
		|Jl. Raya Kedungwaringin
		|Kec. Bojong Gede
		|Kab. Bogor
		|16710
	""".trimMargin()
	var address3 	: String 	= """
		>Jl. Raya Kedungwaringin
		>Kec. Bojong Gede
		>Kab. Bogor
		>16710
	""".trimMargin(">")

	println("Address1\t\t\t: ")
	println(address1)
	println()
	println("Address2\t\t\t: ")
	println(address2)
	println()
	println("Address3\t\t\t: ")
	println(address3)
	println()

	// String Concat
	var firstName 	: String 	= "Rangga"
	var lastName 	: String 	= "Wiraguna"
	var fullName 	: String 	= firstName + " " + lastName

	println("Full Name\t\t\t: " + fullName)
	println()

	// String Template
	var fullNameTemplate 		: String 	= "$firstName $lastName"
	var fullNameTemplateLength 	: String 	= "${fullNameTemplate.length}"
	var descTemplate 			: String 	= "My name is $fullNameTemplate"

	println("Full Name Template\t: " + fullNameTemplate)
	println("Full Name Length\t: " + fullNameTemplateLength)
	println("Desc Template\t\t: " + descTemplate)
	println()
}