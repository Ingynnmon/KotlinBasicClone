import java.lang.Exception

fun main(ags:Array<String>){

    try {
        print("Enter number")
        var num2: Int = readLine()!!.toInt()
        var div = 100 / num2
        println("Div: $div")
    }catch (ex:Exception){
        println(ex.message)
    }
    print("app is done")
}