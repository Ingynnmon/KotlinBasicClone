interface op {
    var num: Int
    fun sum(n1: Int, n2: Int)
    fun sub(n1: Int, n2: Int)
}
class UserOp(override var num: Int):op{
    override fun sum(n1: Int, n2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sub(n1: Int, n2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
fun main(args:Array<String>){
    val userOp=UserOp(30)
}