package top_interview_questions

/**
 * https://leetcode.com/problems/roman-to-integer/submissions/1092137879/
 */

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val singleNumeralsMap = hashMapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
    )
    val multipleNumeralsMap = hashMapOf(
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900
    )
    var sum = 0
    var number = s
    while (number.isNotEmpty()) {
        val complexNumber = if (number.length < 2) {
            null
        } else {
            multipleNumeralsMap[number.substring(startIndex = 0, endIndex = 2)]
        }
        if (complexNumber != null) {
            sum += complexNumber
            number = number.substring(2)
        } else {
            sum += singleNumeralsMap[number[0].toString()]!!
            number = number.substring(1)
        }
    }
    return sum
}