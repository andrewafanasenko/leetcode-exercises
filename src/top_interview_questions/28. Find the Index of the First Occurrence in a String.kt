package top_interview_questions

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1093724751/
 */

fun main() {
    println(strStr("sadbutsad", "sad"))
    println(strStr("leetcode", "leeto"))
}

fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}