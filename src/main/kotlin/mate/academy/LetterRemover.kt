package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val array = input.lowercase().toCharArray()
        for (i in input.indices) {
            array[i] = if (array[i] == 'r') '!' else array[i]
        }
        return array
    }
}

