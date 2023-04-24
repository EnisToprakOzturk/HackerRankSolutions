import java.io.*
import java.util.*

fun main(args: Array<String>) {
    // Soulution with sort function
    val size = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map{it.toInt()}.toTypedArray()
    
    arr.sort()
    
    for (i in arr){
        print("$i ")
    } 
}