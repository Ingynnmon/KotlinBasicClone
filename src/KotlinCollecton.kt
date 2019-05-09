fun main(args:Array<String>){

    var map= hashMapOf(1 to "cat",2 to "dog")
    map.put(3,"bird")
    println(map.get(3))
    println(map[3])

    var ar= arrayOf(1,10,2,3,4)
    println(ar[0])
    var list= mutableListOf(11,22,33,44)
    list[0]=33

    for(item in list){
        println(item)
    }
}