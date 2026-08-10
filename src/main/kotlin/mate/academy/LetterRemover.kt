package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic fun removeLetter(word: String) : CharArray {
            return word.lowercase()
                .replace("r", "!")
                .toCharArray()
        }
    }
}
