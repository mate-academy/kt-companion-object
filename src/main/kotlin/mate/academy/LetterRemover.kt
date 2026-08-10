package mate.academy

object LetterRemover {
    @JvmStatic fun removeLetter(input: String): CharArray {
        val arr = CharArray(input.length)
        for (i in input.indices) {
            if (input.lowercase()[i] == 'r') {
                arr[i] = '!'
            } else arr[i] = input.lowercase()[i]
        }
        return arr
    }
}
