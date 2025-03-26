package mate.academy

class LetterRemover {
    // implement ...
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            return input
                .lowercase()
                .map {
                    if (it == 'r') '!' else it
                }
                .toCharArray()
        }
    }
}
