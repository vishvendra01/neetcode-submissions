class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        val length = strs.minOfOrNull { it.length } ?: 0
        for (i in 0 until length) {
            val char = strs[0][i]
            for (j in 1 until strs.size) {
                if (strs[j][i] == char)
                    continue
                else
                    return result
            }
            result += char
        }
        return result
    }
}
