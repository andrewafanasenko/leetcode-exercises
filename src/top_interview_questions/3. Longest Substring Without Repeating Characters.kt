package top_interview_questions

import kotlin.math.max

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1148204902/
 */
fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
    println(lengthOfLongestSubstring("bbbbb"))
    println(lengthOfLongestSubstring("pwwkew"))
}

fun lengthOfLongestSubstring(s: String): Int {
    val charSet = hashSetOf<Char>()
    var previousIndex = 0
    var length = 0
    for (index in s.indices) {
        val char = s[index]
        while (charSet.contains(char)) {
            charSet.remove(s[previousIndex])
            previousIndex++
        }
        charSet.add(char)
        length = max(charSet.size, length)
    }
    return length
}