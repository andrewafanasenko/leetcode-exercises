package top_interview_questions

/**
 * https://leetcode.com/problems/move-zeroes/submissions/1096833845/
 */

fun main() {
    println(moveZeroes(intArrayOf(0, 1, 0, 3, 12)).toList())
    println(moveZeroes(intArrayOf(0)).toList())
}

fun moveZeroes(nums: IntArray): IntArray {
    val nonZero = mutableListOf<Int>()
    nums.forEach {
        if (it != 0) {
            nonZero.add(it)
        }
    }
    if (nums.size > nonZero.size) {
        repeat(nums.size - nonZero.size) {
            nonZero.add(0)
        }
    }
    nonZero.forEachIndexed { index, i ->
        nums[index] = i
    }
    return nums
}