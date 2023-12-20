package top_interview_questions

/**
 * https://leetcode.com/problems/search-insert-position/submissions/1124354765/
 */

fun main() {
    println(searchInsert(intArrayOf(1, 3, 5, 6), 5))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 2))
    println(searchInsert(intArrayOf(1, 3, 5, 6), 9))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    if (target > nums[nums.lastIndex]) return nums.size
    var currentIndex = 0
    while (currentIndex < nums.size) {
        if (nums[currentIndex] == target || nums[currentIndex] > target) {
            return currentIndex
        }
        currentIndex++
    }
    return currentIndex
}