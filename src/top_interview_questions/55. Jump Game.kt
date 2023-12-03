package top_interview_questions

/**
 * https://leetcode.com/problems/jump-game/submissions/1111535624/
 */

fun main() {
    println(canJump(intArrayOf(2, 3, 1, 1, 4)))
    println(canJump(intArrayOf(3, 2, 1, 0, 4)))
    println(canJump(intArrayOf(2, 0)))
}

fun canJump(nums: IntArray): Boolean {
    var maxIndex = 0
    for (index in 0..nums.lastIndex) {
        if (index > maxIndex) return false
        maxIndex = maxOf(maxIndex, index + nums[index])
        if (maxIndex >= nums.lastIndex) return true
    }
    return false
}
