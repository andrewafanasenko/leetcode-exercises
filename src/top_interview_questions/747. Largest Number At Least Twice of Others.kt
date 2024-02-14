package top_interview_questions


/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/submissions/1175429107/
 */
fun main() {
    println(dominantIndex(intArrayOf(3, 6, 1, 0)))
    println(dominantIndex(intArrayOf(1, 2, 3, 4)))
}

fun dominantIndex(nums: IntArray): Int {
    if (nums.isEmpty()) return -1
    var biggestNum = -1
    var secondBiggest = -1
    var biggestNumIndex = -1
    for (index in nums.indices) {
        if (nums[index] > biggestNum) {
            secondBiggest = biggestNum
            biggestNum = nums[index]
            biggestNumIndex = index
        }
        if (nums[index] in (secondBiggest + 1)..<biggestNum) {
            secondBiggest = nums[index]
        }
    }
    return if (secondBiggest * 2 > biggestNum) -1 else biggestNumIndex
}