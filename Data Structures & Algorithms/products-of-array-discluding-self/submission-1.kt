class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
    val result = IntArray(nums.size)

    // Prefix products
    var prefix = 1
    for (i in nums.indices) {
        result[i] = prefix
        prefix *= nums[i]
    }

    // Multiply by suffix products
    var suffix = 1
    for (i in nums.lastIndex downTo 0) {
        result[i] *= suffix
        suffix *= nums[i]
    }

    return result
    }
}
