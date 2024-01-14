package top_interview_questions

import java.util.LinkedList

/**
 * https://leetcode.com/problems/palindrome-linked-list/submissions/1146284057/
 */
fun main() {
    val list1Node1 = ListNode(`val` = 0)
    val list1Node2 = ListNode(`val` = 2)
    val list1Node3 = ListNode(`val` = 2)
    val list1Node4 = ListNode(`val` = 1)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3
    list1Node3.next = list1Node4

    println(isPalindrome(list1Node1))
}

fun isPalindrome(head: ListNode?): Boolean {
    if (head?.next == null) return true
    var node = head
    val list = LinkedList<Int>()
    while (node?.`val` != null) {
        list.add(node.`val`)
        node = node.next
    }
    return list == list.reversed()
}