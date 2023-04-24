import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val minAndSec: String = (s.subSequence(3, 8)).toString()
    var temp: String = (s.subSequence(0, 2)).toString()
    var hour: Int = temp.toInt()
 
    if (s.endsWith("PM") && hour != 12){
        hour += 12
        temp = hour.toString()
    }else if (s.endsWith("AM") && hour == 12){
        temp = "00"
    }
    
    return ("$temp:$minAndSec")
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
