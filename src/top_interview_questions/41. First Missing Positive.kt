package top_interview_questions

/**
 * https://leetcode.com/problems/first-missing-positive/submissions/1097836342/
 */

fun main() {
    println(firstMissingPositive(intArrayOf(1, 2, 0)))
    println(firstMissingPositive(intArrayOf(3, 4, -1, 1)))
    println(firstMissingPositive(intArrayOf(7, 8, 9, 11, 12)))
}

fun firstMissingPositive(nums: IntArray): Int {
    val array = IntArray(nums.size)
    for (num in nums) {
        if (num > 0 && num <= nums.size) {
            array[num - 1] = num
        }
    }

    for (index in array.indices) {
        if (array[index] != index + 1) {
            return index + 1
        }
    }

    return array.size + 1
}