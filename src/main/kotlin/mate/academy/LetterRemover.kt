package mate.academy

const val LETTER_TO_REMOVE = 'r'
const val TARGET_SYMBOL = '!'

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        return input.toCharArray()
            .map { it.lowercaseChar() }
            .map {
                if (it == LETTER_TO_REMOVE) TARGET_SYMBOL else it
            }.toCharArray()
    }
}
