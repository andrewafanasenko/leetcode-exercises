package top_interview_questions

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/submissions/1156692205/
 */
fun main() {
    println(intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
    println(intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).toList())
}

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val result = mutableSetOf<Int>()
    for (num in nums1) {
        nums2.firstOrNull { it == num }?.let {
            result.add(num)
        }
    }
    return result.toIntArray()
}