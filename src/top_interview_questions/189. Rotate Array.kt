package top_interview_questions

/**
 * https://leetcode.com/problems/rotate-array/submissions/1114647634/
 */

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rotate(array, 3)
    println(array.toList())
}

fun rotate(nums: IntArray, k: Int) {
    val temp = IntArray(nums.size)
    for (index in nums.indices) {
        temp[(index + k) % nums.size] = nums[index]
    }
    for (index in nums.indices) {
        nums[index] = temp[index]
    }
}