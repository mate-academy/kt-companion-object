package mate.academy

class LetterRemover {
    companion object {
        @JvmStatic
        fun removeLetter(input: String): CharArray {
            val characters : MutableList<Char> = mutableListOf()
            val finalInput = input.lowercase()
            for (character in finalInput) {
                if (character == 'r') characters.add('!') else characters.add(character)
            }

            return characters.toCharArray()
        }
    }
}
