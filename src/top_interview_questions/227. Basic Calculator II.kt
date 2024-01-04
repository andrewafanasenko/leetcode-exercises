package top_interview_questions

/**
 * https://leetcode.com/problems/basic-calculator-ii/submissions/1136974480/
 */
fun main() {
    println(calculate("3+2*2"))
    println(calculate(" 3/2 "))
    println(calculate(" 3+5 / 2 "))
}

fun calculate(s: String): Int {
    var num = 0
    var operator = '+'
    var last = 0
    var sum = 0

    for (i in s.indices) {
        val c = s[i]
        if (c.isDigit()) {
            num = num * 10 + (c.code - '0'.code)
        }

        if (c.isOperator() || i == s.length - 1) {
            when (operator) {
                '+' -> {
                    sum += last
                    last = num
                }
                '-' -> {
                    sum += last
                    last = -num
                }
                '*' -> last *= num
                '/' -> last /= num
            }

            num = 0
            operator = c
        }
    }
    sum += last
    return sum
}

private fun Char.isOperator() = this == '+' || this == '-' || this == '*' || this == '/'
