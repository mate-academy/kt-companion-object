package mate.academy

const val REPLACE = "r"
const val REPLACE_WITH = "!"

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String) =
        input.lowercase().replace(REPLACE, REPLACE_WITH).toCharArray()
}
