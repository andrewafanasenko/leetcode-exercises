package top_interview_questions

import java.util.Stack

/**
 * https://leetcode.com/problems/valid-parentheses/submissions/1093126810/
 */

fun main() {
    println(isValid("()"))
    println(isValid("()[]{}"))
    println(isValid("(]"))
    println(isValid("(){}}{"))
}

fun isValid(s: String): Boolean {
    val stack = Stack<Char>()
    stack.reverse()
    s.forEach {
        when (it) {
            '(', '[', '{' -> stack.push(it)
            ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
            ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
            '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
        }
    }
    return stack.isEmpty()
}