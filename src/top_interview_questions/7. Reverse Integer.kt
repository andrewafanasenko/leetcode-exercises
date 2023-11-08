package top_interview_questions

import java.util.ArrayList
import kotlin.math.absoluteValue

/**
 * https://leetcode.com/problems/reverse-integer/submissions/1094774472/
 */

fun main() {
    println(reverse(123))
    println(reverse(-123))
    println(reverse(120))
    println(reverse(-2147483648))
}

fun reverse(x: Int): Int {
    val isNegative = x < 0
    var temp = x.toLong().absoluteValue
    val array = ArrayList<Long>()
    do {
        array.add(temp % 10L)
        temp /= 10L
    } while (temp > 0)

    return array.joinToString("").toLong().let {
        when {
            it !in Int.MIN_VALUE..Int.MAX_VALUE -> 0
            isNegative -> it.toInt() * -1
            else -> it.toInt()
        }
    }
}