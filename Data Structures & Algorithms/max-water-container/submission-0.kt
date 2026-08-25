class Solution {
    fun maxArea(heights: IntArray): Int {
        var ans = 0
        var left = 0
        var right = heights.lastIndex
        while (left < right) {
            ans = maxOf(ans, minOf(heights[left], heights[right]) * (right - left))
            if (heights[left] <= heights[right]) {
                left++
            } else {
                right--
            }
        }
        return ans
    }
}
