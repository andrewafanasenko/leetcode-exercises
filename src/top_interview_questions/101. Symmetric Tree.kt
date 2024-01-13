package top_interview_questions

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main() {
    val ti = TreeNode(5)
    val ti1 = TreeNode(5)
    val ti2 = TreeNode(5)
    ti.left = ti1
    ti.right = ti2
    println(isSymmetric(ti))
}

fun isSymmetric(root: TreeNode?): Boolean {
    fun checkSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left?.`val` != right?.`val`) return false
        return checkSymmetric(left?.left, right?.right) && checkSymmetric(left?.right, right?.left)
    }
    return checkSymmetric(root?.left, root?.right)
}


