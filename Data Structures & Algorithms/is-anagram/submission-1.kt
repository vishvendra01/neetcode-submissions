class Solution {
    fun isAnagram(s: String, t: String): Boolean {
                if (s.length != t.length) return false
        val count = IntArray(26) { 0 }
        for (i in 0 until s.length) {
            count[s[i] - 'a']++
            count[t[i] - 'a']--
        }
        return count.find { it > 0 } == null
    }
}
