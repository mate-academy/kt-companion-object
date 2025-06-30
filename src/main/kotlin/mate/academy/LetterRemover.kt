package mate.academy

const val R = 'r'
const val MARK = '!'

object LetterRemover {
    @JvmStatic fun removeLetter(input: String): CharArray {
        return input.lowercase().replace(R, MARK).toCharArray()
        }
}
