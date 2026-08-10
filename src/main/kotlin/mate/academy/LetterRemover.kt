package mate.academy

object LetterRemover {
    private const val REPLACED_WITH: Char = '!'
    private const val CHAR_TO_REPLACE: Char = 'r'

    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val result: CharArray = input.lowercase().toCharArray()
        result.forEachIndexed { idx, item -> if (item == CHAR_TO_REPLACE) result[idx] = REPLACED_WITH }
        return result
    }
}
