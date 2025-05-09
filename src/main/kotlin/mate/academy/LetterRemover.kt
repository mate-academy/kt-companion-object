package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        return input.lowercase().replace('r', '!').toCharArray()
    }
}
