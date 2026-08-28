class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var j = 0
        while (i < nums.size) {
            if (nums[i] != `val`) {
                nums[j] = nums[i]
                j++
            }
            i++
        }
        return j
    }
}
