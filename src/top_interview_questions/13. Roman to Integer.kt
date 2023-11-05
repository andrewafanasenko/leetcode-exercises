package top_interview_questions

fun main() {
    println(romanToInt("III"))
    println(romanToInt("LVIII"))
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val numeralsMap = hashMapOf(
            "I" to 1,
            "IV" to 4,
            "V" to 5,
            "IX" to 9,
            "X" to 10,
            "XL" to 40,
            "L" to 50,
            "XC" to 90,
            "C" to 100,
            "CD" to 400,
            "D" to 500,
            "CM" to 900,
            "M" to 1000
    )
    var sum = 0
    var str = s
    while (str.isNotEmpty()) {
        val complexNumber = if (str.length < 2) {
            null
        } else {
            numeralsMap[str.substring(startIndex = 0, endIndex = 2)]
        }
        if (complexNumber != null) {
            sum += complexNumber
            str = str.substring(2)
        } else {
            sum += numeralsMap[str[0].toString()]!!
            str = str.substring(1)
        }
    }
    return sum
}