package top_interview_questions

/**
 * https://leetcode.com/problems/remove-element/submissions/1126851543/
 */
fun main() {
    println(removeElement(intArrayOf(3, 2, 2, 3), 3))
    println(removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0
    for (index in nums.indices) {
        if (nums[index] != `val`) {
            nums[k] = nums[index]
            k++
        }
    }
    return k
}