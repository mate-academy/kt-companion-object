package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val lowerLetters = input.lowercase()
        val replacedLetters = lowerLetters.replace('r', '!')
        return replacedLetters.toCharArray()
    }
}

fun main() {
    val result = LetterRemover.removeLetter("flower better growing")
    println(result.contentToString())
}
