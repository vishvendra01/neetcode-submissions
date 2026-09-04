class MyHashSet() {
    val array = BooleanArray(1_000_001) { false }

    fun add(key: Int) {
        array[key] = true
    }

    fun remove(key: Int) {
        array[key] = false
    }

    fun contains(key: Int): Boolean {
        return array[key]
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
