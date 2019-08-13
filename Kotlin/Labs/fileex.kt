import java.io.File
import java.Util.*

fun main(args : Array<String>) {
    val file: FIle = File(pathname: "test.txt")
    val sc: Scanner = Scanner(file)
    var oneLine: String
    while (sc.hasNextLiine()){
        oneLine = sc.nextLine()
        println(oneLine)
    }
}