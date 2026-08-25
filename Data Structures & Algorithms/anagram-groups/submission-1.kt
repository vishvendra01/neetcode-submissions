class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val key = str.toCharArray().sorted().joinToString("")
            if (map.contains(key)) {
                map[key]!!.add(str)
            } else {
                map[key] = mutableListOf<String>().apply { add(str) }
            }
        }
        val result = mutableListOf<List<String>>()
        map.keys.forEach { key ->
            result.add(map[key]!!)
        }
        return result
    }
}
