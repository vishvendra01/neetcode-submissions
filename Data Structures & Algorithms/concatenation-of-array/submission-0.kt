class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)
        for (i in 0 until result.size) {
            val index = i % nums.size
            result[i] = nums[index]
        }
        return result
    }
}
