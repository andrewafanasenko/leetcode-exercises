package top_interview_questions

/**
 * https://leetcode.com/problems/majority-element/submissions/1098221480/
 */

fun main() {
    println(majorityElement(intArrayOf(3, 2, 3)))
    println(majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}

fun majorityElement(nums: IntArray): Int {
    val hashMap = HashMap<Int, Int>()
    nums.forEach {
        if (hashMap[it] == null) {
            hashMap[it] = 1
        } else {
            hashMap[it] = (hashMap[it] ?: 0) + 1
        }
    }
    return hashMap.maxBy { it.value }?.key ?: 0
}