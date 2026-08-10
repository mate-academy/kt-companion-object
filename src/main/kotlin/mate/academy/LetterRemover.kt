package mate.academy

object LetterRemover {

    @JvmStatic
    fun removeLetter(str: String): CharArray = str
        .lowercase()
        .replace('r', '!')
        .toCharArray()

}


fun main() {
    val result = LetterRemover.removeLetter("Remove letter")
    println(result)
}

