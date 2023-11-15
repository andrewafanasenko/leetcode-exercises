package top_interview_questions

import java.lang.Integer.max
import java.util.Stack

/**
 * https://leetcode.com/problems/merge-intervals/submissions/1099620855/
 */

fun main() {
    println(
            merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
                    .map { it.toList() }.toList()
    )
    println(merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))).map { it.toList() }.toList())
    println(merge(arrayOf(intArrayOf(1, 4), intArrayOf(0, 4))).map { it.toList() }.toList())
}

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val sorted = intervals.sortedWith(compareBy { it.elementAt(0)})
    val stack = Stack<IntArray>()
    stack.push(sorted[0])
    var index = 1
    while (stack.isNotEmpty() && index < sorted.size) {
        val current = stack.peek()
        val next = sorted[index++]
        if (current[1] >= next[0]) {
            stack.pop()
            current[1] = max(current[1], next[1])
            stack.push(current)
        } else {
            stack.push(next)
        }
    }
    return stack.toArray(Array(stack.size) { IntArray(2) })
}