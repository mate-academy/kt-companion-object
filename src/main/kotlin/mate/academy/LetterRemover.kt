package mate.academy

class LetterRemover private constructor() {
    companion object {
        @JvmStatic
        fun removeLetter(text: String): CharArray =
            text.lowercase().map { ch ->
                if (ch == 'r') '!' else ch
            }.toCharArray()
    }
}
