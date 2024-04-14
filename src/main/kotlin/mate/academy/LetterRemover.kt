package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String) = input.lowercase().replace('r', '!').toCharArray()
}
