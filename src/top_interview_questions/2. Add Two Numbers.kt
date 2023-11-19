package top_interview_questions

/**
 * https://leetcode.com/problems/add-two-numbers/submissions/1102136123/
 */

fun main() {
    val list1Node1 = ListNode(`val` = 2)
    val list1Node2 = ListNode(`val` = 4)
    val list1Node3 = ListNode(`val` = 3)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3

    val list2Node1 = ListNode(`val` = 5)
    val list2Node2 = ListNode(`val` = 6)
    val list2Node3 = ListNode(`val` = 4)

    list2Node1.next = list2Node2
    list2Node2.next = list2Node3

    val result = addTwoNumbers(list1Node1, list2Node1)
    var current = result
    print(current?.`val`)
    while (current?.next != null) {
        print(current.next?.`val`)
        current = current.next
    }
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var head1 = l1
    var head2 = l2
    var rem = 0
    val carry = ListNode(0)
    var result: ListNode? = carry

    while (head1 != null || head2 != null) {
        val sum = rem +  (head1?.`val` ?: 0) + (head2?.`val` ?: 0)

        val value = sum % 10
        rem = sum / 10

        result?.next = ListNode(value)
        result = result?.next

        head1 = head1?.next
        head2 = head2?.next
    }
    if (rem != 0) result?.next = ListNode(rem)
    return carry.next
}