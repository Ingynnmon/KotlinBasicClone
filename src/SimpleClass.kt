class Car(Type:String,Model:Int,Price:Double,
          MilesDrive:Int,Owner:String){

    var Owner:String?=null
    init{
        println("Type: $Type")
        println("Model: $Model")
        println("Price: $Price")
        println("MilesDrive: $MilesDrive")
        println("Owner: $Owner")
        this.Owner=Owner
    }

    fun GetOwner(): String? {
        return this.Owner
    }

}

fun main(args:Array<String>){
    var hutCar=Car("BMW",2015,10000.0,104,"igm")
    var jetCar=Car("Honda",2020,30000.2,22,"igm")

    println("Owner = "+hutCar.GetOwner())
}