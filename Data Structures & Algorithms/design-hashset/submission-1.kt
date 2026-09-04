class MyHashSet() {
    private val bucketSize = 1000
    val buckets = Array(bucketSize) { mutableListOf<Int>() }

    fun add(key: Int) {
        val bucket = buckets[hash(key)]

        if (!bucket.contains(key)) {
            bucket.add(key)
        }
    }

    fun remove(key: Int) {
        val bucket = buckets[hash(key)]
        bucket.remove(key)
    }

    fun contains(key: Int): Boolean {
        val bucket = buckets[hash(key)]
        return bucket.contains(key)
    }

    fun hash(key: Int): Int {
        return key % bucketSize
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
