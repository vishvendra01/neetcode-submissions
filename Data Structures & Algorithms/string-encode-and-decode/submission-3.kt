class Solution {

    fun encode(strs: List<String>): String {
            val stringBuilder = StringBuilder()
            for (i in strs.indices) {
                stringBuilder.append(strs[i].length)
                stringBuilder.append("#")
                stringBuilder.append(strs[i])
            }
            return stringBuilder.toString()
    }

    fun decode(str: String): List<String> {
            val output = mutableListOf<String>()
            var startIndex = 0
            while (startIndex < str.length) {
                val divIndex = str.indexOf("#", startIndex)
                if (divIndex == -1) {
                    break
                }
                val strLength = str.substring(startIndex, divIndex).toInt()
                output.add(str.substring(divIndex + 1, divIndex + 1 + strLength))
                startIndex = divIndex + 1 + strLength
            }
            return output
    }
}
