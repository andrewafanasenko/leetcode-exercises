package top_interview_questions

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/1110469554/
 */

fun main() {
    println(intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
    println(intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).toList())
    println(intersect(intArrayOf(2, 1), intArrayOf(1, 2)).toList())
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.sort()
    nums2.sort()
    val result = mutableListOf<Int>()
    var firstIndex = 0
    var secondIndex = 0
    while (firstIndex < nums1.size && secondIndex < nums2.size) {
        if (nums1[firstIndex] == nums2[secondIndex]) {
            result.add(nums1[firstIndex])
            firstIndex++
            secondIndex++
        } else if (nums1[firstIndex] > nums2[secondIndex]) {
            secondIndex++
        } else if (nums1[firstIndex] < nums2[secondIndex]) {
            firstIndex++
        }
    }
    return result.toIntArray()
}