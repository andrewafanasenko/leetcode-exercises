package top_interview_questions

/**
 * https://leetcode.com/problems/powx-n/submissions/1097378631/
 */

fun main() {
    println(myPow(x = 2.00000, n = 10))
    println(myPow(x = 2.10000, n = 3))
    println(myPow(x = 2.00000, n = -2))
    println(myPow(x = 34.00515, n = -3))
    println(myPow(x = 2.0, n = -2147483648))
    println(myPow(1.0000000000001, -2147483648))
}

fun myPow(x: Double, n: Int): Double {
    var number = x
    if (n == 0) return 1.0
    var power = n.toLong()
    if (power < 0) {
        power = -power
        number = 1 / number
    }
    return if (power % 2 == 0L) {
        myPow(number * number, (power / 2).toInt())
    } else {
        number * myPow(number, (power - 1).toInt())
    }
}