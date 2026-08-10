package mate.academy

class LetterRemover {
    companion object {
        fun removeLetter(line : String) : CharArray {
            return line.lowercase().replace("r", "!").toCharArray()
        }
    }
}

fun main() {
    val input = "Remove Letters"
    println(LetterRemover.removeLetter(input).toList())
}
