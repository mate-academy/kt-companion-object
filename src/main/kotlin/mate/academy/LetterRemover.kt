package mate.academy

class LetterRemover {
    companion object {
        fun removeLetter(input: String): CharArray {
            return input.toLowerCase()
                        .map { if (it == 'r') '!' else it }
                        .toCharArray()
        }
    }
}
