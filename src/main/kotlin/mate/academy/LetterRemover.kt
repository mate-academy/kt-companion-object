package mate.academy


fun main() {
    val removeLetter = LetterRemover.removeLetter("Remove Letters")
    println(removeLetter)
}

object LetterRemover {
    @JvmStatic
    fun removeLetter(input: String): CharArray = input.lowercase().replace('r', '!').toCharArray()
}
