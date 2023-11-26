package top_interview_questions

/**
 * https://leetcode.com/problems/string-to-integer-atoi/submissions/1106979631/
 */

fun main() {
    println(myAtoi("42"))
    println(myAtoi("   -42"))
    println(myAtoi("4193 with words"))
    println(myAtoi("3.14159"))
    println(myAtoi("words and 987"))
    println(myAtoi("9223372036854775808"))
}

fun myAtoi(s: String): Int {
    val length = s.length
    if (length == 0) return 0
    var result = 0.0
    var index = 0
    while (index < length && s[index] == ' ') {
        index++
    }
    if (index == length) return 0
    val isNegative = s[index] == '-'
    if (s[index] == '+' || isNegative) index++

    while (index < length && s[index] in '0'..'9') {
        result = result * 10 + (s[index].code - '0'.code)
        index++
    }
    result = if (isNegative) -result else result
    result = if (result > Int.MAX_VALUE) Int.MAX_VALUE.toDouble() else result
    result = if (result < Int.MIN_VALUE) Int.MIN_VALUE.toDouble() else result
    return result.toInt()
}