import java.io.FileWriter
import java.lang.Exception

fun main(args:Array<String>){
    print("Write to file txt: ")
    var str:String= readLine().toString()
    writeToFile(str)
}
fun writeToFile(str:String){
    try {
        var fout = FileWriter("text.txt",true)
        fout.write(str+"\n")
        fout.close()
    }catch (ex:Exception){
        print(ex.message)
    }
}