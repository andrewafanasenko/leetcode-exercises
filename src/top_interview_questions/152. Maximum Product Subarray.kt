package top_interview_questions

/**
 * https://leetcode.com/problems/maximum-product-subarray/submissions/1134757790/
 */
fun main() {
    println(maxProduct(intArrayOf(2, 3, -2, 4)))
    println(maxProduct(intArrayOf(-2, 0, -1)))
}

fun maxProduct(nums: IntArray): Int {
    var res = nums.max()
    var min = 1
    var max = 1

    for (n in nums) {
        val temp = min * n
        min = minOf(n * max, n * min, n)
        max = maxOf(n * max, temp, n)
        res = maxOf(res, max)
    }
    return res
}