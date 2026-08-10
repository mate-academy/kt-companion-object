package mate.academy

class LetterRemover {
    companion object {
        const val LETTER_R: Char = 'r'
        const val SYM: Char = '!'

        @JvmStatic fun removeLetter(input: String): CharArray = input
            .lowercase()
            .replace(LETTER_R, SYM)
            .toCharArray()
    }
}
