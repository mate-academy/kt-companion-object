package mate.academy

class LetterRemover {
    // implement ...

    companion object {
        @JvmStatic
        fun removeLetter(text: String): CharArray {
            return text
                .lowercase()
                .map { if (it == 'r') '!' else it }
                .toCharArray()
        }
    }
}
