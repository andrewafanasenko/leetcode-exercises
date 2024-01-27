package top_interview_questions

/**
 * https://leetcode.com/problems/third-maximum-number/submissions/1158580708/
 */
fun main() {
    println(thirdMax(intArrayOf(3,2,1)))
    println(thirdMax(intArrayOf(1,2)))
    println(thirdMax(intArrayOf(2,2,3,1)))
}

fun thirdMax(nums: IntArray): Int {
    val sorted = nums.toSortedSet()
    return sorted.elementAtOrElse(sorted.size - 3) { sorted.last() }
}