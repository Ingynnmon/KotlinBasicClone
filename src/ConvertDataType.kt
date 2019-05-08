fun main(args: Array<String>){
    var n1:Int=10
    var n2:Int?
    var nToStr:String = "12"
    n2=nToStr.toInt()
    println("n1: "+ n1)
    println("n2: "+n2)
    var nToFloat:Float?
    nToFloat=nToStr.toFloat()
    println("n1: "+n1)
    println("n2: "+n2)
    println("nToFloat: "+nToFloat)

    var nToDouble:Double= 3.14
    println("nToDouble" +nToDouble)
    var IntPi: Int = nToDouble.toInt()
    println("IntPi: "+IntPi.toString())

}