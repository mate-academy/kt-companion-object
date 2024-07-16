package mate.academy

object LetterRemover {

        @JvmStatic
        fun removeLetter(input: String) : CharArray {
            val replaced = input
                .lowercase()
                .replace('r','!')
            return replaced.toCharArray()
        }
}
