package mate.academy

class LetterRemover(str: String) {

    companion object {
        @JvmStatic
        fun removeLetter(str: String): CharArray {
            val newstr = str.lowercase().replace("r", "!")
            println(newstr)
            return newstr.toCharArray()
        }
    }
}
