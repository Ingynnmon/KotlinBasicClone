fun main(args:Array<String>){
    var map=HashMap<Int,String>()
    map.put(1,"cat")
    map.put(2,"dog")
    map.put(3,"bird")
    println(map.get(3))

    map.put(33,"tiger")
    for(k in map.keys){
        println(map.get(k)) 
    }
}