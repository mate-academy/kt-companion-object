package mate.academy

object LetterRemover {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            val result = mutableListOf<Char>()
            val lowercase = input.lowercase()
            for (char in lowercase) {
                if (char == 'r') {
                    result.add('!')
                } else {
                    result.add(char)
                }
            }
            return result.toCharArray()
        }
}

