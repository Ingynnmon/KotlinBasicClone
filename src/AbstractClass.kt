abstract class CreditCard(){
    fun CreditID():String{
        return "123454sdf"
    }
}

class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreditID()
    }
}

fun main(args:Array<String>){
    var user=UserInfo()
    println("credit id: "+user.getInfo())

}