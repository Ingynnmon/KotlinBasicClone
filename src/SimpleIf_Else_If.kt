fun main(args: Array<String>){
    println("Enter your grade: ")
    var grade= readLine()!!.toDouble()

    if(grade>=90){
        //block of code
        println("You are in A level")
    }else if(grade>=80 && grade<90){
        println("You are in B level")
    }else if(grade>=70 && grade<80){
        println("You are in C level")
    }else{
        println("You fail")
    }
    println("You enter grade : $grade")
}