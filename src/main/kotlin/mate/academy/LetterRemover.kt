package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String) = input
        .lowercase()
        .map { if (it == 'r') '!' else it }
        .toCharArray()
}
