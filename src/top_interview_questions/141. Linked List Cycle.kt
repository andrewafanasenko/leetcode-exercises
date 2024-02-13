package top_interview_questions

/**
 * https://leetcode.com/problems/linked-list-cycle/submissions/1174404540/
 */
fun main() {
    val list1Node1 = ListNode(`val` = 3)
    val list1Node2 = ListNode(`val` = 2)
    val list1Node3 = ListNode(`val` = 0)
    val list1Node4 = ListNode(`val` = -4)

    list1Node1.next = list1Node2
    list1Node2.next = list1Node3
    list1Node3.next = list1Node4
    list1Node4.next = list1Node2

    println(hasCycle(list1Node1))
}

fun hasCycle(head: ListNode?): Boolean {
    val hashSet = HashSet<ListNode>()
    var current = head
    while (current != null) {
        if (hashSet.contains(current)) return true
        hashSet.add(current)
        current = current.next
    }
    return false
}