enum class Direction{
    NORTH,EAST,SOUTH,WEST
}
fun main(args:Array<String>){
    var userdirection=Direction.EAST

    if(userdirection==Direction.NORTH){
        println("u went to north")
    }else{
        println("I don't know where u went")
    }
}