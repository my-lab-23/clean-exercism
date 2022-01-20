import org.apache.commons.lang3.StringUtils

object Bob {
    fun hey(input: String): String {

        if(input.isBlank()) { return "Fine. Be that way!" }

        var s = input.replace(" ", "")
        val isQuestion = s.last() == '?'
        s = input.filter { it.isLetter() }

        if(StringUtils.isAllUpperCase(s) && isQuestion) {
            return "Calm down, I know what I'm doing!"
        } else if(StringUtils.isAllUpperCase(s)) {
            return "Whoa, chill out!"
        } else if(isQuestion) { return "Sure." }

        return "Whatever."
    }
}
