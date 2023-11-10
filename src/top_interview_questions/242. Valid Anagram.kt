package top_interview_questions


/**
 * https://leetcode.com/problems/valid-anagram/submissions/1096192163/
 */

fun main() {
    println(isAnagram(s = "anagram", t = "nagaram"))
    println(isAnagram(s = "rat", t = "car"))
}

fun isAnagram(s: String, t: String): Boolean {
    return s.toCharArray().sorted() == t.toCharArray().sorted()
}