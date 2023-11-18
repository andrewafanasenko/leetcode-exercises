package top_interview_questions

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/1101617080/
 */

fun main() {
    val list1Node1 = ListNode(`val` = 1)
    val list1Node2 = ListNode(`val` = 2)
    val list1Node3 = ListNode(`val` = 4)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3

    val list2Node1 = ListNode(`val` = 1)
    val list2Node2 = ListNode(`val` = 3)
    val list2Node3 = ListNode(`val` = 4)

    list2Node1.next = list2Node2
    list2Node2.next = list2Node3

    println(mergeTwoLists(list1Node1, list2Node1)?.`val`)
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val result = ListNode(0)
    var l1 = list1
    var l2 = list2
    var current = result

    while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
            current.next = l1
            l1 = l1.next
        } else {
            current.next = l2
            l2 = l2.next
        }
        current = current.next ?: break
    }

    l1?.let { current.next = l1 }
    l2?.let { current.next = l2 }

    return result.next
}