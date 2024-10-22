package mate.academy

object LetterRemover {
    fun removeLetter(input: String): CharArray {
        return input.lowercase()
                    .map { if (it == 'r') '!' else it }
                    .toCharArray()
    }
}
