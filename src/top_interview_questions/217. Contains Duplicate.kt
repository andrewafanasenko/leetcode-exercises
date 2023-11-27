package top_interview_questions

import java.util.HashSet

/**
 * https://leetcode.com/problems/contains-duplicate/submissions/1107740577/
 */
fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))
    println(containsDuplicate(intArrayOf(1, 2, 3, 4)))
    println(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val hashSet = HashSet<Int>()
    nums.forEach {
        if (hashSet.contains(it)) {
            return true
        } else {
            hashSet.add(it)
        }
    }
    return false
}
