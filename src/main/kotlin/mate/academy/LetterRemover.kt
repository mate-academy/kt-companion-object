package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic fun removeLetter(word: String): CharArray {
            val array = word.toCharArray()
            var count = 0
            for (letter in word) {
                if (letter == 'r' || letter == 'R') {
                    array[count] = '!'
                    count++
                } else {
                    array[count] = letter.lowercaseChar()
                    count++
                }
            }
            return array
        }
    }
}
