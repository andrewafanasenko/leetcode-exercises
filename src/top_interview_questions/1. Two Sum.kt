package top_interview_questions

/**
 * https://leetcode.com/problems/two-sum/submissions/1091434243/?source=submission-ac
 */

fun main() {
    print(twoSum(intArrayOf(2, 7, 11, 15), 9).toList())
    print(twoSum(intArrayOf(3, 2, 4), 6).toList())
    print(twoSum(intArrayOf(3, 3), 6).toList())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap = hashMapOf<Int, Int>()
    for (index in nums.indices) {
        val expectedValue = target - nums[index]
        hashMap[expectedValue]?.let {
            return intArrayOf(it, index)
        } ?: run {
            hashMap[nums[index]] = index
        }
    }
    return intArrayOf()
}