fun main(args: Array<String>){
    var x=5
      
    when(x){
        1-> print("value is 1")
        2->print("value is 2")
        3->print("value is 3")
        in 4..10->{print("value is between 4 and 10")}
        else ->{
            print("value is out of range")
        }
    }
}