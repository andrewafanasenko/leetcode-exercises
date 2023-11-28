package top_interview_questions

/**
 * https://leetcode.com/problems/power-of-three/submissions/1108462363/
 */

fun main() {
    println(isPowerOfThree(27))
    println(isPowerOfThree(0))
    println(isPowerOfThree(-1))
}

fun isPowerOfThree(n: Int): Boolean {
    var num = n
    if (num <= 0) return false
    while (num % 3 == 0) {
        num /= 3
    }
    return num == 1
}