package top_interview_questions

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/submissions/1147234992/
 */
fun main() {
    println(trailingZeroes(3))
    println(trailingZeroes(5))
    println(0)
}

fun trailingZeroes(n: Int): Int {
    var number = n
    var count = 0
    while (number != 0) {
        count += number / 5
        number /= 5
    }
    return count
}