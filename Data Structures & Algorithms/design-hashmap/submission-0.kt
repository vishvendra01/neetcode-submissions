class MyHashMap() {
    val bucketSize = 1000
    val buckets = Array(1000) {
        mutableListOf<Pair<Int, Int>>()
    }

    fun put(key: Int, value: Int) {
        val pos = hash(key)
        val bucket = buckets[pos]
        val exist = bucket.find { it.first == key }
        if (exist == null) {
            bucket.add(Pair(key, value))
        } else {
            val index = bucket.indexOf(exist)
            bucket[index] = Pair(key, value)
        }
    }

    fun get(key: Int): Int {
        val pos = hash(key)
        val bucket = buckets[pos]
        val data = bucket.find { it.first == key }
        return data?.second ?: -1
    }

    fun remove(key: Int) {
        val pos = hash(key)
        val bucket = buckets[pos]
        val data = bucket.find { it.first == key }
        if (data != null) {
            val index = bucket.indexOf(data)
            bucket.removeAt(index)
        }
    }

    private fun hash(key: Int): Int {
        return key % bucketSize
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
