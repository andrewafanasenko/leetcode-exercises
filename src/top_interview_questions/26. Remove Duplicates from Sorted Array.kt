package top_interview_questions

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1093712334/
 */

fun main() {
    println(removeDuplicates(intArrayOf(1,1,2)))
    println(removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)))
}

fun removeDuplicates(nums: IntArray): Int {
    val withoutDuplicates = nums.distinct()
    withoutDuplicates.forEachIndexed { index, num ->
        if (nums[index] != num) {
            nums[index] = num
        }
    }
    return withoutDuplicates.size
}