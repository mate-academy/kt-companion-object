package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(str: String): CharArray {
        return str.lowercase().replace('r', '!').toCharArray()
    }
}
