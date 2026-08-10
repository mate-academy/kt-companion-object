package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            return input.lowercase()
                .replace("r", "!")
                .toCharArray()
        }
    }

    fun main() {
        val output = removeLetter("Remove Letters")
        println(output.joinToString(""))
    }
}
