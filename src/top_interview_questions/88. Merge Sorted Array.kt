package top_interview_questions

/**
 * https://leetcode.com/problems/merge-sorted-array/submissions/1100306968/
 */

fun main() {
    println(merge(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3).toList())
    println(merge(intArrayOf(1), 1, intArrayOf(), 0).toList())
    println(merge(intArrayOf(0), 0, intArrayOf(1), 1).toList())
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1

    while (j >= 0) {
        if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--]
        } else {
            nums1[k--] = nums2[j--]
        }
    }
    return nums1
}