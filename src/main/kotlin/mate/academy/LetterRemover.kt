package mate.academy

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val lower = input.lowercase()
        val replaced = lower.replace('r', '!')
        return replaced.toCharArray()
    }
}

