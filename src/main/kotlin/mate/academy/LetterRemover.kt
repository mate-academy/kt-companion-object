package mate.academy

class LetterRemover private constructor() {

    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            return input.map { char ->
                when {
                    char.lowercaseChar() == 'r' -> '!'
                    char.isLetter() -> char.lowercaseChar()
                    else -> char
                }
            }.toCharArray()
        }
    }
}
