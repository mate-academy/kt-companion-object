package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray = input.lowercase().replace('r', '!').toCharArray()
    }
}
