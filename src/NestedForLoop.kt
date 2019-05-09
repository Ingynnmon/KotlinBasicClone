fun main(args:Array<String>){
    for(count in 1..5){
        println("count1: $count")
        for(count2 in 1..7){
            println("count2: $count")
        }
        println("loop nested done")
    }
    println("Loop done")
}