class Solution {
    fun isPalindrome(s: String): Boolean {
                var left = 0
        var right = s.lastIndex
        while (left < right) {
            if (Character.isLetterOrDigit(s[left]).not()) {
                left++
                continue
            }

            if (Character.isLetterOrDigit(s[right]).not()) {
                right--
                continue
            }

            if (Character.toLowerCase(s[left]) != Character.toLowerCase(s[right])) {
                return false
            }

            left++
            right--
        }
        return true
    }
}
