package mate.academy

object LetterRemover {
    fun removeLetter(input: String): CharArray {
        val result = input.lowercase().replace('r', '!')
        return result.toCharArray()
    }
}
