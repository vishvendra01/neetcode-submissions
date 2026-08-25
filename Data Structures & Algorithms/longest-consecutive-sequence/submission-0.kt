class Solution {
    fun longestConsecutive(nums: IntArray): Int {
    var maxLength = 0
    val numSet = nums.toSet()
    for (num in numSet) {
      if (!numSet.contains(num - 1)) {
        var currentNum = num
        var currentLength = 1
        while (numSet.contains(currentNum + 1)) {
          currentNum++
          currentLength++
        }
        maxLength = maxOf(maxLength, currentLength)
      }
    }
    return maxLength
    }
}
