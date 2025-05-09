package mate.academy

object LetterRemover {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            return input.replace("r", "!", true).lowercase().toCharArray()
        }
}
