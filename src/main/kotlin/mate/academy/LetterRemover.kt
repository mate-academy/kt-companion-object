package mate.academy

object LetterRemover {

    @JvmStatic
    fun removeLetter(text: String): CharArray {
        return text
            .lowercase()
            .map { if (it == 'r') '!' else it }
            .toCharArray()
    }
}
