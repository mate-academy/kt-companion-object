package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(text: String): CharArray {
            return text.lowercase().replace("r", "!").toCharArray()
        }
    }
    // implement ...
}
