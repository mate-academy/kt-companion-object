package mate.academy

object LetterRemover {
    private const val REPLACED_WITH: Char = '!'
    private val charsToReplace: Set<Char> = setOf('R', 'r')

    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val result: CharArray = input.lowercase().toCharArray()
        input.forEachIndexed { idx, item -> if (item in charsToReplace) result[idx] = REPLACED_WITH }
        return result
    }
}
