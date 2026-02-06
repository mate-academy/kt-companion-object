package mate.academy

class LetterRemover{
    private constructor()
    companion object {
        @JvmStatic fun removeLetter(input : String) : CharArray {
            return input.lowercase()
                .map { ch -> if (ch == 'r') '!' else ch }
                .toCharArray()
        }
    }
}

fun main() {
    println(LetterRemover.removeLetter("mother father brother"))
}
