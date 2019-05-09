fun main(args:Array<String>){
    var arrayList= ArrayList<String>()
    arrayList.add("dog")
    arrayList.add("cat")
    arrayList.add("fish")
    arrayList.add("tiger")

    println("First animal: "+arrayList.get(0))
    arrayList.set(0,"bird")

    println("all element by object")
    for(item in arrayList){
        println(item)
    }
    println("all element by index")
    for(index in 0..arrayList.size-1){
         println(arrayList.get(index))
    }

    //Search
    if(arrayList.contains("cat")){
        println("animal is found")
    }else{
        println("animal is not found")
    }
}