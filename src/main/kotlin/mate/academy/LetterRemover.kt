package mate.academy

class LetterRemover private constructor() {
    companion object {
        @JvmStatic
        val letterReplaceWith = mapOf(Pair('r', '!'))

        @JvmStatic
        fun removeLetter(input: String): CharArray {
            return input.lowercase()
                .map {
                    if (letterReplaceWith.containsKey(it)) {
                        letterReplaceWith[it]
                    } else it
                }
                .map { it!!.toChar() }
                .toCharArray()
        }
    }
}
