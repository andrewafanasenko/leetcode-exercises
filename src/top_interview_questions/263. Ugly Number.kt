package top_interview_questions

/**
 * https://leetcode.com/problems/ugly-number/submissions/1129193653/
 */

fun main() {
    println(isUgly(6))
    println(isUgly(1))
    println(isUgly(14))
    println(isUgly(0))
}

fun isUgly(n: Int): Boolean {
    if (n == 0) return false
    val result = when {
        n % 2 == 0 -> n / 2
        n % 3 == 0 -> n / 3
        n % 5 == 0 -> n / 5
        n == 1 -> 0
        else -> -1
    }
    return when {
        result == 0 -> true
        result != -1 -> isUgly(result)
        else -> false
    }
}