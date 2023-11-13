package top_interview_questions

import java.lang.Integer.max

/**
 * https://leetcode.com/problems/house-robber/submissions/1098205632/
 */

fun main() {
    println(rob(intArrayOf(1, 2, 3, 1)))
    println(rob(intArrayOf(2, 7, 9, 3, 1)))
    println(rob(intArrayOf(2, 1, 1, 2)))
}

fun rob(nums: IntArray): Int {
    var curMax = 0
    var preMax = 0
    for (num in nums) {
        val temp = curMax
        curMax = max(num + preMax, curMax)
        preMax = temp
    }
    return curMax
}