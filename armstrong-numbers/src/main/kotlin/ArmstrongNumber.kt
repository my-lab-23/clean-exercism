import kotlin.math.pow

object ArmstrongNumber {

    private fun Int.toDigits(): List<Int> = toString().map { it.toString().toInt() }

    private fun Int.pow(esponente: Int): Int {
        return this.toDouble().pow(esponente.toDouble()).toInt()
    }

    private fun powLen(list: List<Int>): List<Int> {
        return list.map { it.pow(list.size) }
    }

    fun check(input: Int): Boolean {
        val digit: List<Int> = input.toDigits()
        val pL = powLen(digit)
        return input == pL.sum()
    }
}
