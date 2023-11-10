package top_interview_questions

/**
 * https://leetcode.com/problems/excel-sheet-column-number/submissions/1096169912/
 */

fun main() {
    println(titleToNumber("A"))
    println(titleToNumber("AB"))
    println(titleToNumber("ZY"))
}

fun titleToNumber(columnTitle: String): Int {
    var sum = 0
    for (char in columnTitle.toCharArray()) {
        sum *= 26
        sum += char - 'A' + 1
    }
    return sum
}