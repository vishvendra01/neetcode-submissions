class Solution {
    fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()
    val operators = listOf("+", "-", "*", "/")
    for (token in tokens) {
      if (token in operators) {
        when (token) {
          "+" -> {
            val op1 = stack.removeFirst()
            val op2 = stack.removeFirst()
            stack.addFirst(op2 + op1)
          }
          "-" -> {
            val op1 = stack.removeFirst()
            val op2 = stack.removeFirst()
            stack.addFirst(op2 - op1)
          }
          "*" -> {
            val op1 = stack.removeFirst()
            val op2 = stack.removeFirst()
            stack.addFirst(op2 * op1)
          }
          "/" -> {
            val op1 = stack.removeFirst()
            val op2 = stack.removeFirst()
            stack.addFirst(op2 / op1)
          }
        }
      } else {
        stack.addFirst(token.toInt())
      }
    }
    return stack.removeFirst()
    }
}
