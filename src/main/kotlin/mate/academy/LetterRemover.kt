package mate.academy

class LetterRemover private constructor() {
    companion object {
        private const val TARGET_CHAR = 'r'
        private const val REPLACEMENT_CHAR = '!'
        @JvmStatic fun removeLetter(input: String): CharArray {
            return input
                .lowercase()
                .map { if (it == TARGET_CHAR) REPLACEMENT_CHAR else it }
                .toCharArray()
        }
    }
}
