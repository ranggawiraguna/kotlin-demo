import com.learning.kotlin.config.*
import com.learning.kotlin.service.printName
import com.learning.kotlin.service.printNameWithAge
import com.learning.kotlin.service.printNameWithAgeAndStatus
import com.learning.kotlin.service.getNameWithAgeAndStatus
import com.learning.kotlin.service.printNameWithAgeAndStatusSingleExpression
import com.learning.kotlin.service.getNameWithAgeAndStatusSingleExpression

fun main(){
	println("App Name\t: $APP")
	println("App Version\t: $VERSION")
	println("Base Url\t: $BASE_URL")
	print("Result\t\t: ")
	printName()
	print("Result\t\t: ")
	printNameWithAge("Rangga Wiraguna Rudiyanto",25)
	print("Result\t\t: ")
	printNameWithAge("Awal Udin",null)
	print("Result\t\t: ")
	printNameWithAgeAndStatus("Rangga Wiraguna Rudiyanto",25,"Single")
	print("Result\t\t: ")
	printNameWithAgeAndStatus("Awal Udin")
	print("Result\t\t: ")
	printNameWithAgeAndStatus(
		name = "Rangga Wiraguna Rudiyanto",
		status = "Single",
		age = 25,
		)
	print("Result\t\t: ")
	println(getNameWithAgeAndStatus("Rangga Wiraguna Rudiyanto",25,"Single"))
	print("Result\t\t: ")
	println(printNameWithAgeAndStatusSingleExpression("Rangga Wiraguna Rudiyanto",25,"Single"))
	print("Result\t\t: ")
	println(getNameWithAgeAndStatusSingleExpression("Rangga Wiraguna Rudiyanto",25,"Single"))
}