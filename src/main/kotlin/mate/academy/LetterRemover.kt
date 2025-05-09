package mate.academy

class LetterRemover private constructor() {
    companion object {
        @JvmStatic
        fun removeLetter(string: String): CharArray {
            return string.lowercase()
                .replace('r', '!')
                .toCharArray()
        }
    }
}
