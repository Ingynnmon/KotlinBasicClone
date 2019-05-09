import java.util.*

fun main(args:Array<String>){

    //input
    print("Enter your Date of birth: ")
    var Dob:Int= readLine()!!.toInt()

    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age= year-Dob

    //output
    println("your age is : $age years")
}