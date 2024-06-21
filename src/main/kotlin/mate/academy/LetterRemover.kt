package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): Array<Char> {
            return input.lowercase()
                .map { if (it == 'r') '!' else it }
                .toTypedArray()
        }
    }
}
