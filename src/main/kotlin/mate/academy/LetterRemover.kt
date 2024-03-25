package mate.academy


fun main() {
    val removeLetter = LetterRemover.removeLetter("Remove Letters")
    println(removeLetter)
}

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            return input.lowercase().replace('r', '!').toCharArray()
        }
    }
}
