class Solution {

    fun encode(strs: List<String>): String {
            val sb = StringBuilder()
            for (str in strs) {
                sb.append("#")
                val length = str.length
                if (length < 10) {
                    sb.append("00").append(length)
                } else if (length < 100) {
                    sb.append("0").append(length)
                } else {
                    sb.append(length)
                }
                sb.append(str)
            }
            return sb.toString()
    }

    fun decode(str: String): List<String> {
            val result = mutableListOf<String>()
            var i = 0
            while (i < str.length) {
                val index = str.indexOf("#", i)
                val strSize = str.substring(index + 1, index + 1 + 3).toInt()
                val subStr = str.substring(index + 4, index + 4 + strSize)
                result.add(subStr)
                i = i + 4 + strSize
            }
            return result
    }
}
