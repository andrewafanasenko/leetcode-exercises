package top_interview_questions

/**
 * https://leetcode.com/problems/sort-colors/submissions/1095515010/
 */

fun main() {
    println(sortColors(intArrayOf(2, 0, 2, 1, 1, 0)).toList())
    println(sortColors(intArrayOf(2, 0, 1)).toList())
}

fun sortColors(nums: IntArray): IntArray {
    for (index in 1 until nums.size) {
        val current = nums[index]
        var previousIndex = index - 1
        while (previousIndex >= 0 && nums[previousIndex] > current) {
            nums[previousIndex + 1] = nums[previousIndex]
            previousIndex -= 1
        }
        nums[previousIndex + 1] = current
    }
    return nums
}