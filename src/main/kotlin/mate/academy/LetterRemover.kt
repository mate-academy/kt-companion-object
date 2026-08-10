package mate.academy

object LetterRemover {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            val lowerInput = input.lowercase()
            val array = CharArray(input.length){' '}
            for (i in input.indices) {
                if (lowerInput[i] == 'r') {
                    array[i] = '!'
                }else {
                    array[i] = lowerInput[i]
                }
            }
            return array
        }
}

