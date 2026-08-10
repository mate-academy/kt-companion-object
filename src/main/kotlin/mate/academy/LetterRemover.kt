package mate.academy

//object LetterRemover {
//    @JvmStatic
//    fun removeLetter(input: String): CharArray {
//        val replacedString = input.lowercase().replace('r', '!')
//        return replacedString.toCharArray()
//    }
//}

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            val replacedString = input.lowercase().replace('r', '!')
            return replacedString.toCharArray()
        }
    }
}
