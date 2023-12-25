package top_interview_questions

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1128084320/
 */

fun main() {
    val list1Node1 = ListNode(`val` = 1)
    val list1Node2 = ListNode(`val` = 1)
    val list1Node3 = ListNode(`val` = 2)
    val list1Node4 = ListNode(`val` = 3)
    val list1Node5 = ListNode(`val` = 3)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3
    list1Node3.next = list1Node4
    list1Node4.next = list1Node5

    val result = deleteDuplicates(list1Node1)
    var current = result
    print(current?.`val`)
    while (current?.next != null) {
        print(current.next?.`val`)
        current = current.next
    }
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var temp = head
    while (temp?.next != null) {
        if (temp.`val` == temp.next?.`val`) {
            temp.next = temp.next?.next
        } else {
            temp = temp.next
        }

    }
    return head
}