package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val result = CharArray(input.length)
        for (i in input.indices) {
            val c = input[i].lowercaseChar()
            if (c == 'r') {
                result[i] = '!'
            } else {
                result[i] = c
            }
        }
        return result
    }
}
