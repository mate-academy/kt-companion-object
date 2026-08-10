package mate.academy

class LetterRemover private constructor() {
    companion object {
        @JvmStatic
        fun removeLetter(input: String) = input.lowercase().replace('r', '!').toCharArray()
    }
}
