package top_interview_questions

import kotlin.math.max

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1112829856/
 */

fun main() {
    println(maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    println(maxProfit(intArrayOf(7, 6, 4, 3, 1)))
}

fun maxProfit(prices: IntArray): Int {
    var min = prices[0]
    var maxProfit = 0

    for (i in 1..<prices.size) {
        if (prices[i] < min) {
            min = prices[i]
        } else {
            maxProfit = max(maxProfit, prices[i] - min)
        }
    }

    return maxProfit
}