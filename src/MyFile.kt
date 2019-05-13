import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception
import kotlin.system.exitProcess

fun main(args:Array<String>){
    println("1- read\n 2- write \n")
    val op= readLine()!!.toInt()
    when(op){
        1-> {
            ReadFromFile()
        }
        2-> {
            print("Write to file txt: ")
            var str:String= readLine().toString()
            writeToFile(str)
        }
    }
    println("Do you want to process more? y/n")
    val choice= readLine()!!.toString()
    while(choice.equals("y")){

            println("1- read\n 2- write \n")
            val op= readLine()!!.toInt()
            when(op){
                1-> {
                    ReadFromFile()
                }
                2-> {
                    print("Write to file txt: ")
                    var str:String= readLine().toString()
                    writeToFile(str)
                }
            }
    }
   /* */
}
fun writeToFile(str:String){
    try {
        val fout = FileWriter("text.txt",true)
        fout.write(str+"\n")
        fout.close()
        println("data is saved")
    }catch (ex:Exception){
        print(ex.message)
    }
}
fun ReadFromFile(){
    try{
        val fin=FileReader("text.txt")
        var c:Int? //to read character
        do{
            c=fin.read()
            print(c.toChar())
        }while(c!=-1)

    }catch (ex:Exception){
        print(ex.message)
    }

}