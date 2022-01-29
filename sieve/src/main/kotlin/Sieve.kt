object Sieve {

    private fun markMultiplesOfCurrent(isPotentiallyPrime: MutableList<Int>, i: Int) {
        var n = i + i
        while (n < isPotentiallyPrime.size) {
            isPotentiallyPrime[n] = -1
            n += i
        }
    }

    fun primesUpTo(maxValue: Int): List<Int> {
        val isPotentiallyPrime = MutableList(maxValue+1) { it }

        isPotentiallyPrime[0] = -1
        isPotentiallyPrime[1] = -1

        for (i in 2..maxValue / 2) {
            if (isPotentiallyPrime[i] != -1) {
                markMultiplesOfCurrent(isPotentiallyPrime, i)
            }
        }

        return isPotentiallyPrime.filter { it != -1 }
    }
}
