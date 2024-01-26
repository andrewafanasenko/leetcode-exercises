package top_interview_questions

/**
 * https://leetcode.com/problems/find-the-difference/submissions/1157769713/
 */
fun main() {
    println(findTheDifference(s = "abcd", t = "abcde"))
    println(findTheDifference(s = "", t = "y"))
}

fun findTheDifference(s: String, t: String): Char {
    val original = s.toMutableList()
    for (letter in t) {
        original.indexOfFirst { it == letter }.let {
            if (it == -1) {
                return letter
            } else {
                original.removeAt(it)
            }
        }
    }
    return ' '
}