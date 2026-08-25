class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map = IntArray(26) { 0 }
        for (i in s.indices) {
            map[s[i] - 'a']++
            map[t[i] - 'a']--
        }
        return map.any { it > 0 }.not()
    }
}
