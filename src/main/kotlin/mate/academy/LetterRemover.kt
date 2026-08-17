package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            val lowerLetters = input.lowercase()
            val replacedLetters = lowerLetters.replace('r', '!')
            return replacedLetters.toCharArray()
        }
    }
}
