package top_interview_questions

/**
 * https://leetcode.com/problems/length-of-last-word/submissions/1127501951/
 */

fun main() {
    println(lengthOfLastWord("Hello World"))
    println(lengthOfLastWord("   fly me   to   the moon  "))
    println(lengthOfLastWord("luffy is still joyboy"))
}

fun lengthOfLastWord(s: String): Int {
    var length = 0
    for (index in s.length - 1 downTo 0) {
        val isWhitespace = s[index] == ' '
        when {
            isWhitespace && length != 0 -> break
            isWhitespace -> continue
            else -> length++
        }
    }
    return length
}