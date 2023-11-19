package top_interview_questions

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/submissions/1102337589/
 */

fun main() {
    println(firstUniqChar("leetcode"))
    println(firstUniqChar("loveleetcode"))
    println(firstUniqChar("aabb"))
}

fun firstUniqChar(s: String): Int {
    var result = -1
    var index = 0
    while (index < s.length) {
        val char = s[index]
        if (s.indexOf(char) == s.lastIndexOf(char)) {
            result = index
            break
        }
        index++
    }
    return result

}