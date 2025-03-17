package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        return input.toCharArray()
            .map { if (it.lowercaseChar() == 'r') '!' else it.lowercaseChar() }
            .toCharArray()
    }
}
