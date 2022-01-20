object Pangram {

    fun isPangram(input: String): Boolean {

        val alphabet: List<Char> = "abcdefghijklmnopqrstuvwxyz".toList()
        val caseTest: List<Char> = input
            .lowercase()
            .toList()
            .filter { it.isLetter() }
            .distinct()
            .sorted()

        return alphabet == caseTest
    }
}
