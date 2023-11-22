package top_interview_questions

/**
 * https://leetcode.com/problems/single-number/submissions/1104461533/
 */

fun main() {
    println(singleNumber(intArrayOf(2, 2, 1)))
    println(singleNumber(intArrayOf(4, 1, 2, 1, 2)))
    println(singleNumber(intArrayOf(1)))
}

fun singleNumber(nums: IntArray): Int {
    val hashSet = HashSet<Int>()
    nums.forEach {
        if (hashSet.contains(it)) {
            hashSet.remove(it)
        } else {
            hashSet.add(it)
        }
    }
    return hashSet.first()
}