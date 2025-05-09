package mate.academy

class LetterRemover private constructor() {
    companion object {
        @JvmStatic
        fun removeLetter(text: String): CharArray {
            return text.lowercase().replace("r", "!").toCharArray()
        }
    }
    // implement ...
}
