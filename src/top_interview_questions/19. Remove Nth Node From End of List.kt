package top_interview_questions

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/1113829517/
 */

fun main() {
    val list1Node1 = ListNode(`val` = 1)
    val list1Node2 = ListNode(`val` = 2)
    val list1Node3 = ListNode(`val` = 3)
    val list1Node4 = ListNode(`val` = 4)
    val list1Node5 = ListNode(`val` = 5)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3
    list1Node3.next = list1Node4
    list1Node4.next = list1Node5

    var current = removeNthFromEnd(list1Node1, 2)
    print(current?.`val`)
    while (current?.next != null) {
        print(current.next?.`val`)
        current = current.next
    }
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var size = 0
    var node = head
    while (node != null) {
        size++
        node = node.next
    }
    var toRemove = size - n
    if (toRemove == 0) return head?.next
    node = head
    while (toRemove > 1) {
        node = node?.next
        toRemove--
    }
    node?.next = node?.next?.next
    return head
}