package top_interview_questions

/**
 * https://leetcode.com/problems/sqrtx/submissions/1094550430/
 */

fun main() {
    println(mySqrt(4))
    println(mySqrt(8))
    println(mySqrt(2147395599))
    println(mySqrt(2147483647))
}

fun mySqrt(x: Int): Int {
    var closest = 1L
    var lastCorrect = 0L
    while (closest > 0) {
        val multiplication = closest * closest
        if (multiplication >= Int.MAX_VALUE || multiplication.toInt() > x) {
            lastCorrect = closest - 1
            break
        } else if (multiplication.toInt() == x) {
            lastCorrect = closest
            break
        }
        closest++
    }
    return lastCorrect.toInt()
}