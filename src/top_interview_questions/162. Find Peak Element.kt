package top_interview_questions

/**
 * https://leetcode.com/problems/find-peak-element/submissions/1135994070/
 */
fun main() {
    println(findPeakElement(intArrayOf(1, 2, 3, 1)))
    println(findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)))
    println(findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)))
}

fun findPeakElement(nums: IntArray): Int {
    var resultIndex = -1
    var resultValue = Int.MIN_VALUE
    for (index in nums.indices) {
        if (resultIndex == -1) {
            resultIndex = index
            resultValue = nums[index]
        } else {
            val value = nums[index]
            if (value > resultValue) {
                resultValue = value
                resultIndex = index
            }
        }
    }
    return resultIndex
}