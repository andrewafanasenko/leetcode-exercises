package top_interview_questions

/**
 * https://leetcode.com/problems/reverse-string/submissions/1096842462/
 */

fun main() {
    println(reverseString(charArrayOf('h','e','l','l','o')).toList())
    println(reverseString(charArrayOf('H','a','n','n','a','h')).toList())
}

fun reverseString(s: CharArray): CharArray {
    val midPoint = (s.size / 2) - 1
    if (midPoint < 0) return s
    var reverseIndex = s.lastIndex
    for (index in 0..midPoint) {
        val tmp = s[index]
        s[index] = s[reverseIndex]
        s[reverseIndex] = tmp
        reverseIndex--
    }
    return s
}