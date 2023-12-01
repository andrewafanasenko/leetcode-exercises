package top_interview_questions

/**
 * https://leetcode.com/problems/fizz-buzz/submissions/1110473126/
 */

fun main() {
    println(fizzBuzz(3))
    println(fizzBuzz(5))
    println(fizzBuzz(15))
}

fun fizzBuzz(n: Int): List<String> {
    return (1..n).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }
}