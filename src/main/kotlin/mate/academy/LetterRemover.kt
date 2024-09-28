package mate.academy

class LetterRemover {
    // implement ...
    companion object {
        @JvmStatic fun removeLetter(input : String) : CharArray =
            input.lowercase().replace('r', '!', true).toCharArray()
    }
}
