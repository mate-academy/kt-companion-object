package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic fun removeLetter(input : String) : CharArray {
            return input.map { char -> if (char.equals('r', ignoreCase = true)) '!'
            else char.lowercaseChar()}
                .toCharArray()
        }

    }
}
