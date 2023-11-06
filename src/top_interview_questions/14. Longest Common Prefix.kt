package top_interview_questions

/**
 * https://leetcode.com/problems/longest-common-prefix/submissions/1093014747/
 */

fun main() {
    println(longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    println(longestCommonPrefix(arrayOf("dog", "racecar", "car")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = strs[0]
    for (word in strs) {
        if (word == prefix) continue
        prefix = prefix.commonPrefixWith(word)
    }
    return prefix
}