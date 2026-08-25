class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val remaining = target - nums[i]
            if (map.contains(remaining)) {
                return intArrayOf(map[remaining]!!, i)
            } else {
                map[nums[i]] = i
            }
        }
        return intArrayOf()
    }
}
