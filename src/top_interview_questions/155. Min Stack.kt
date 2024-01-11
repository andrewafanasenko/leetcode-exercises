package top_interview_questions

import kotlin.math.min

/**
 * https://leetcode.com/problems/min-stack/submissions/1143677705/
 */
fun main() {
    val obj = MinStack()
    obj.push(4)
    obj.push(10)
    obj.push(11)
    obj.push(1)
    obj.pop()
    println(obj.top())
    println(obj.getMin())
}

class MinStack {

    private val stack = mutableListOf<Pair<Int, Int>>()

    fun push(`val`: Int) = if (stack.isEmpty()) {
        stack.add(`val` to `val`)
    } else {
        stack.add(`val` to min(`val`, stack.last().second))
    }

    fun pop() = stack.removeAt(stack.size - 1)

    fun top(): Int = stack.last().first

    fun getMin(): Int = stack.last().second

}