package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val mutableListOf = mutableListOf<Char>()
        val toCharArray = input.toCharArray()
        for (ch in toCharArray) {
            if (ch == 'r' || ch == 'R') {
                mutableListOf.add('!')
                continue
            }
            mutableListOf.add(ch.lowercaseChar())
        }
        return mutableListOf.toCharArray()
    }
}
