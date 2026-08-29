class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            if (map.contains(key)) {
                map[key]?.add(str)
            } else {
                map[key] = mutableListOf<String>().also { it.add(str) }
            }
        }
        val result = mutableListOf<List<String>>()
        for (entry in map.entries) {
            result.add(entry.value)
        }
        return result
    }
}
