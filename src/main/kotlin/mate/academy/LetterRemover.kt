package mate.academy

object LetterRemover {
    private const val REPLACED_WITH: Char = '!'
    private val charToReplace: Char = 'r'

    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val result: CharArray = input.lowercase().toCharArray()
        result.forEachIndexed { idx, item -> if (item == charToReplace) result[idx] = REPLACED_WITH }
        return result
    }
}
