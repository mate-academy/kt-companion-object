package mate.academy

class LetterRemover private constructor() {
    companion object Remover {
        @JvmStatic fun removeLetter(input: String) : CharArray = input.lowercase()
            .replace("r", "!")
            .toCharArray()
    }
}
