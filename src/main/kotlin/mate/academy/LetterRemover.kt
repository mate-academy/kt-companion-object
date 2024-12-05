package mate.academy

class LetterRemover {
    // implement ...
    companion object {
        @JvmStatic
        fun removeLetter(str: String): CharArray {
            val modifiedString = str.lowercase().replace("r", "!")
            return modifiedString.toCharArray() // Converts the modified string to a CharArray
        }
    }
}
