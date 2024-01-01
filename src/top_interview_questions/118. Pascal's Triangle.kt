package top_interview_questions

/**
 * https://leetcode.com/problems/pascals-triangle/submissions/1134071202/
 */
fun main() {
    println(generate(5))
    println(generate(1))
}

fun generate(numRows: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    for (row in 1..numRows) {
        if (result.isEmpty()) {
            result.add(listOf(row))
        } else {
            val subList = mutableListOf<Int>()
            for (index in 0..<row) {
                if (index == 0 || index == row - 1) {
                    subList.add(1)
                } else {
                    val previousRow = result[row - 2]
                    subList.add(previousRow[index - 1] + previousRow[index])
                }
            }
            result.add(subList)
        }
    }
    return result
}