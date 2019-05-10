interface op{
    fun sum(n1:Int,n2:Int)
    fun sub(n1:Int,n2:Int)
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int) {
        println("sum: "+n1+n2)
    }

}