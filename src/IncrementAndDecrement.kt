
/*
Operations rules| Priorities rules
1- ()
2- ++, -- (before var)
2- ^
3- * | /
4- + | -
5- =
6- ++,-- (after var)
 */
fun main(args: Array<String>){
    var x=10
    var y=11
    var z=--x+y //(++x)=(x=x+1)
    println("z: $z")

    var m=x+++y
    println("x: $m")
}