package top_interview_questions

/**
 * https://leetcode.com/problems/add-digits/submissions/1131735301/
 */

fun main() {
    println(addDigits(38))
}

fun addDigits(num: Int): Int {
    if (num == 0) return 0
    val result = num % 9
    if (result == 0) return 9
    return result
}