package top_interview_questions

import java.util.ArrayList

/**
 * https://leetcode.com/problems/happy-number/submissions/1096185716/
 */

fun main() {
    println(isHappy(19))
    println(isHappy(2))
}

fun isHappy(n: Int): Boolean {
    var temp = n
    fun getNumArray(): ArrayList<Int> {
        val array = ArrayList<Int>()
        do {
            array.add(temp % 10)
            temp /= 10
        } while (temp > 0)
        return array
    }
    val existingSum = HashSet<Int>()
    var isHappy = false
    while (isHappy.not()) {
        temp = getNumArray().sumBy { it * it }
        if (existingSum.contains(temp)) break
        existingSum.add(temp)
        isHappy = temp == 1
    }
    return isHappy
}