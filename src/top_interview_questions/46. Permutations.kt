package top_interview_questions

import java.util.LinkedList

/**
 * https://leetcode.com/problems/permutations/submissions/1104447035/
 */

fun main() {
    println(permute(intArrayOf(1, 2, 3)))
    println(permute(intArrayOf(0, 1)))
    println(permute(intArrayOf(1)))
}

fun permute(nums: IntArray): List<List<Int>> {
    val result = LinkedList<List<Int>>().apply { add(ArrayList()) }
    for (num in nums) {
        for (size in result.size downTo 1) {
            val firstNum = result.pollFirst()
            for (i in 0..firstNum.size) {
                val newCombination = firstNum.toMutableList()
                newCombination.add(i, num)
                result.add(newCombination)
            }
        }
    }
    return result
}