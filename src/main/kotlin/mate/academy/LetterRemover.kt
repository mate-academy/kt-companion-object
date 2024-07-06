package mate.academy

const val SYMBOL_R_LOWERCASE = 'r'
const val REPLACING_SYMBOL = '!'

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String) =
        input.lowercase().replace(SYMBOL_R_LOWERCASE, REPLACING_SYMBOL).toCharArray()
}
