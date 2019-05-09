fun main(args: Array<String>){
    println("Enter your grade: ")
    var grade= readLine()!!.toDouble()

    if(grade>=90){
        //block of code
        println("You are in A level")
    }else{
        //block of code
        println("You are not in A level")
    }
    println("You enter grade : $grade")
}