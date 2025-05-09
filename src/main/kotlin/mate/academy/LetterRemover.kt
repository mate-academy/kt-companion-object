package mate.academy

class LetterRemover private constructor() {

    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray =
            input.replace("r", "!", ignoreCase = true).lowercase().toCharArray()
    }

}
