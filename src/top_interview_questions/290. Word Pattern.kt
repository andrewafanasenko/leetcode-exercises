package top_interview_questions

/**
 * https://leetcode.com/problems/word-pattern/submissions/1130050560/
 */

fun main() {
    println(wordPattern("abba", "dog cat cat dog"))
    println(wordPattern("abba", "dog cat cat fish"))
    println(wordPattern("aaaa", "dog cat cat dog"))
    println(wordPattern("abba", "dog dog dog dog"))
}

fun wordPattern(pattern: String, s: String): Boolean {
    val hashMap = hashMapOf<Char, String>()
    val words = s.split(' ')
    if (words.size != pattern.length) return false

    words.forEachIndexed { index, word ->
        if (hashMap[pattern.getOrNull(index)] == null) {
            if (hashMap.values.contains(word)) return false
            hashMap[pattern[index]] = word
        } else if (hashMap[pattern[index]] != word) {
            return false
        }
    }
    return true
}