package mate.academy

class LetterRemover {
    companion object {
        fun removeLetter(input: String): CharArray {
            val result = input.lowercase().replace('r', '!')
            return result.toCharArray()
        }
    }
}
