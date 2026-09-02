class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val target = target - nums[i]
            if (map.contains(target)) {
                return intArrayOf(map[target]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}
