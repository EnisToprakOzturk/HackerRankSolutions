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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {

    var plusCounter = 0
    var minusCounter = 0
    var zeroCounter = 0

    for (i in arr) {
        if (i > 0){
            plusCounter += 1
        }else if (i < 0) {
            minusCounter += 1
        }else {
            zeroCounter += 1
        }
    }

    val plusRatio: Double = String.format("%.6f" ,(plusCounter.toDouble() / arr.size)).toDouble()
    val minusRatio: Double = String.format("%.6f" ,(minusCounter.toDouble() / arr.size)).toDouble()
    val zeroRatio: Double = String.format("%.6f" ,(zeroCounter.toDouble() / arr.size)).toDouble()

    print("$plusRatio\n$minusRatio\n$zeroRatio")
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}