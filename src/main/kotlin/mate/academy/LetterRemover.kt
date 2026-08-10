package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(str: String): CharArray {
        val modifiedString = str.lowercase().replace("r", "!")
        return modifiedString.toCharArray()
    }
}
