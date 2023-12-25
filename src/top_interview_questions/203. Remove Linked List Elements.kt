package top_interview_questions

/**
 * https://leetcode.com/problems/remove-linked-list-elements/submissions/1128441421/
 */
fun main() {
    val list1Node1 = ListNode(`val` = 1)
    val list1Node2 = ListNode(`val` = 6)
    val list1Node3 = ListNode(`val` = 2)
    val list1Node4 = ListNode(`val` = 6)
    val list1Node5 = ListNode(`val` = 3)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3
    list1Node3.next = list1Node4
    list1Node4.next = list1Node5

    val result = removeElements(list1Node1, 6)
    var current = result
    print(current?.`val`)
    while (current?.next != null) {
        print(current.next?.`val`)
        current = current.next
    }
}

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val newHead = ListNode(0)
    newHead.next = head
    var current: ListNode? = newHead
    while (current?.next != null) {
        if (current.next?.`val` == `val`) {
            current.next = current.next?.next
            continue
        }
        current = current.next
    }
    return newHead.next
}