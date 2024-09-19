package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter (str : String) : CharArray {
            return str.lowercase().replace("r", "!").toCharArray()
        }
    }
}
