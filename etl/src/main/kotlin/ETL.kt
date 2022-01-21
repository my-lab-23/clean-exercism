object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val newMap = mutableMapOf<Char, Int>()

        for(s in source) {
            for(v in s.value) {
                val key = v.lowercase()[0]
                val value = s.key
                newMap[key] = value
            }
        }

        return newMap
    }
}
