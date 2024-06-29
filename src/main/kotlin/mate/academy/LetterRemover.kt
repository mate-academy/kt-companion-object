package mate.academy

object LetterRemover {
        @JvmStatic
        fun removeLetter(inputString: String): CharArray =
            inputString.lowercase().replace('r', '!').toCharArray()
}
