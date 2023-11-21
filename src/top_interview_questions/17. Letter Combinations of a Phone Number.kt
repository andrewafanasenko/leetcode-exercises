package top_interview_questions

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/1103685100/
 */

fun main() {
    println(letterCombinations("23"))
    println(letterCombinations("2"))
    println(letterCombinations("234"))
}

fun letterCombinations(digits: String): List<String> {
    val digitsLettersMap = hashMapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz",
    )
    var result = mutableListOf<String>()
    if (digits.length == 1) {
        digitsLettersMap[digits.first()]?.forEach {
            result.add(it.toString())
        }
        return result
    }

    for (digit in digits) {
        val letters = digitsLettersMap[digit] ?: break
        if (result.isEmpty()) {
            letters.forEach { result.add(it.toString()) }
            continue
        }
        val modified = mutableListOf<String>()
        for (existingIndex in 0 until result.size) {
            for (index in letters.indices) {
                modified.add(result[existingIndex] + letters[index])
            }
        }
        result = modified
    }
    return result
}
