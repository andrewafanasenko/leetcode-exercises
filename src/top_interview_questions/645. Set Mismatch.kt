package top_interview_questions

/**
 * https://leetcode.com/problems/set-mismatch/submissions/1159544881/
 */
fun main() {
    println(findErrorNums(intArrayOf(1, 2, 2, 4)).toList())
    println(findErrorNums(intArrayOf(1, 1)).toList())
}

fun findErrorNums(nums: IntArray): IntArray {
    var duplicate = 0
    var missed = 0

    val count = IntArray(nums.size + 1)
    count[nums[0]] += 1
    for (i in 1 until nums.size) {
        count[nums[i]] += 1
    }

    for (j in 1 until count.size) {
        if (count[j] > 1) duplicate = j
        if (count[j] == 0) missed = j
    }

    return intArrayOf(duplicate, missed)
}