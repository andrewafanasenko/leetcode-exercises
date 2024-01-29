package top_interview_questions

/**
 * https://leetcode.com/problems/sort-array-by-parity/submissions/1160475232/
 */
fun main() {
    println(sortArrayByParity(intArrayOf(3, 1, 2, 4)).toList())
}

fun sortArrayByParity(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var evenindex = 0
    var oddIndex = nums.size - 1

    for (index in nums.indices) {
        val number = nums[index]
        if (number % 2 == 0) {
            result[evenindex++] = number
        } else {
            result[oddIndex--] = number
        }
    }

    return result
}