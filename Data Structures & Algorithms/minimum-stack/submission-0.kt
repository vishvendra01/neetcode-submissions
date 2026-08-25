class MinStack() {
    val stack = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
      stack.addFirst(`val`)
      if (minStack.isEmpty() || `val` <= getMin()) {
        minStack.addFirst(`val`)
      }
    }

    fun pop() {
      val pop = stack.removeFirst()
      if (pop == getMin()) {
        minStack.removeFirst()
      }
    }

    fun top(): Int {
      return stack.first()
    }

    fun getMin(): Int {
      return minStack.first()
    }
}
