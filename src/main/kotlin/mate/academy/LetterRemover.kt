package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(string: String): CharArray {
            return string.lowercase().asSequence()
                .map { if (it == 'r' || it == 'R') '!' else it }
                .toList()
                .toCharArray()
        }
    }
}
