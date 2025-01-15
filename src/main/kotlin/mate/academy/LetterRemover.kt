package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(string: String) : CharArray {
            return string.lowercase()
                            .toCharArray()
                            .map { if (it == 'r') '!' else it }
                            .toCharArray()
        }
    }
}
