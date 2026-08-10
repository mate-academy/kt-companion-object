package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(text: String): CharArray {
        return text.lowercase().replace("r", "!").toCharArray()
    }
}
