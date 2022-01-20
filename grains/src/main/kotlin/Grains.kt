import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {

        if(number < 1 || number > 64 ) {
            throw IllegalArgumentException("Invalid input!")
        }

        return BigInteger("2").pow(number) / BigInteger("2")
    }

    fun getTotalGrainCount(): BigInteger {
        return BigInteger("2").pow(64) - BigInteger("1")
    }
}
