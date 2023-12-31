package top_interview_questions

/**
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1133261847/
 */
fun main() {
    println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8).toList())
    println(searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6).toList())
}

fun searchRange(nums: IntArray, target: Int): IntArray {
    val startIndex = findFirst(nums, target)
    val endIndex = if (startIndex == -1) return intArrayOf(-1, -1) else findLast(nums, target)
    return intArrayOf(startIndex, endIndex)
}

fun findFirst(nums: IntArray, target: Int): Int {
    var result = -1
    for (index in nums.indices) {
        if (nums[index] == target) {
            result = index
            break
        }
    }
    return result
}

fun findLast(nums: IntArray, target: Int): Int {
    var result = -1
    for (index in nums.size - 1 downTo 0) {
        if (nums[index] == target) {
            result = index
            break
        }
    }
    return result
}