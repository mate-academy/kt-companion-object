package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(string: String): CharArray = string
        .lowercase()
        .replace('r', '!')
        .toCharArray()

}
