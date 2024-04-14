package mate.academy

class LetterRemover {
    companion object{
        @JvmStatic
        fun removeLetter(input: String) = input.lowercase().replace('r', '!').toCharArray()
    }
}
