package top_interview_questions

import java.util.Stack

/**
 * https://leetcode.com/problems/valid-palindrome/submissions/1107718643/
 */

fun main() {
    println(isPalindrome("A man, a plan, a canal: Panama"))
    println(isPalindrome("race a car"))
    println(isPalindrome(""))
}

fun isPalindrome(s: String): Boolean {
    val stack = Stack<Char>()
    val reversedStack = Stack<Char>()
    s.forEach {
        if (it.isLetterOrDigit()) {
            val lowercase = it.lowercaseChar()
            stack.add(lowercase)
            reversedStack.add(lowercase)
        }
    }
    reversedStack.reverse()
    while (stack.isNotEmpty()) {
        val start = stack.pop()
        val end = reversedStack.pop()
        if (start == end) continue else return false
    }
    return true
}