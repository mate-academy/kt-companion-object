package mate.academy

class LetterRemover private constructor() {
    companion object {
        @JvmStatic
        fun removeLetter(input: String) = input.lowercase().map { if (it == 'r') '!' else it }.toCharArray()
    }
}
