class UserAdmins<T>(credit:Any){
    init{
        println(credit)
    }
}

fun <T> display(process: T){
    println(process)
}

fun main(args:Array<String>){
    var userAdmins=UserAdmins<String>("igm")
    var userAdmins2=UserAdmins<Int>(1234)
    var userAdmins3=UserAdmins<Double>(123.4)

    display<Int>(22)
    display<String>("igm")
}