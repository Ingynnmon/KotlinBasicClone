
fun sum(n1:Double,n2:Double):Double{
    //code
    var sum=n1+n2
    return sum
}

fun main(args:Array<String>){
    var r=sum(1.2,4.5)
    println("r: $r")

    disply(6)

}
fun disply(n:Int):Unit{
    print("n: $n")
}