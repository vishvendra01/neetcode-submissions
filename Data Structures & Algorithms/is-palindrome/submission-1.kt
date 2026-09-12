class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex
        while (left < right) {
            val leftChar = s[left]
            val rightChar = s[right]
            if (Character.isLetterOrDigit(leftChar).not()) {
                left++
                continue
            }
            if (Character.isLetterOrDigit(rightChar).not()) {
                right--
                continue
            }
            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false
            }
            left++
            right--
        }
        return true
    }
}
