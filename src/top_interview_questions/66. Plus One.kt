package top_interview_questions

/**
 * https://leetcode.com/problems/plus-one/submissions/1093848920/
 */

fun main() {
    println(plusOne(intArrayOf(1,2,3)).toList())
    println(plusOne(intArrayOf(4,3,2,1)).toList())
}

fun plusOne(digits: IntArray): IntArray {
    for (index in digits.indices.reversed()) {
        if (digits[index] + 1 < 10) {
            digits[index] = digits[index] + 1
            return digits
        } else {
            digits[index] = 0
            digits.getOrNull(index - 1)?.let {
                digits[index - 1] = digits[index - 1]
            }?: run {
                return intArrayOf(1) + digits
            }
        }
    }
    return digits
}