package top_interview_questions

/**
 * https://leetcode.com/problems/missing-number/submissions/1107747591/
 */
fun main() {
    println(missingNumber(intArrayOf(3, 0, 1)))
    println(missingNumber(intArrayOf(0, 1)))
    println(missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
}

fun missingNumber(nums: IntArray): Int {
    val set = hashSetOf<Int>().apply {
        nums.forEach { add(it) }
    }
    for (num in 0..nums.size) {
        if (set.contains(num).not()) {
            return num
        }
    }
    return nums.first()
}