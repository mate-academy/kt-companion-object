package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val stringToArray = CharArray(input.length)
        val inputLower = input.lowercase()
        for ((index, char) in inputLower.withIndex()) {
            stringToArray[index] = if (char != 'r') char else '!'
        }
        return stringToArray
    }
}
