class CarMode(){

    var Owner:String?=null
    var Model:Int?=null
    var Price:Double?=null
    var MilesDrive:Int?= null
    var Type:String?= null
    constructor(Type: String,Model: Int,Price: Double,
                MilesDrive: Int,Owner: String):this(){

        println("Type: $Type")
        println("Model: $Model")
        println("Price: $Price")
        println("MilesDrive: $MilesDrive")
        println("Owner: $Owner")
        this.Owner=Owner
        this.Model=Model
        this.Price=Price
        this.MilesDrive=MilesDrive
        this.Type=Type
    }

    constructor(Name:String):this(){
        print("new class instance")
    }

    fun GetOwner(): String? {
        return this.Owner
    }

}

fun main(args:Array<String>){
    var c=CarMode("Igm")
}