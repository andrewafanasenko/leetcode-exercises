package top_interview_questions

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/1095528473/
 */

fun main() {
    println(findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
    println(findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 5)))
    println(findMedianSortedArrays(intArrayOf(0, 0, 0, 0, 0), intArrayOf(-1, 0, 0, 0, 0, 0, 1)))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val combined = nums1 + nums2
    combined.sort()
    val middle = combined.size / 2
    return if (combined.size % 2 == 0) {
        (combined[middle - 1] + combined[middle]) / 2.0
    } else {
        combined[middle].toDouble()
    }
}