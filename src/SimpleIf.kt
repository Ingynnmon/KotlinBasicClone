fun main(args:Array<String>){
    println("Enter your grade: ")
    var grade= readLine()!!.toDouble()

    if(grade>=90){
        //block of code
        println("You are in A level")
    }

    if(grade>=50 && grade <=70){
        grade = grade+10
        println("yout get extra 10 point")
    }

    println("You enter grade : $grade")
}