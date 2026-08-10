package mate.academy

object LetterRemover {
    // implement ...
    @JvmStatic fun removeLetter(input : String) : CharArray =
        input.lowercase().replace('r', '!', true).toCharArray()
}
