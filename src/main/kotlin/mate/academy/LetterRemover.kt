package mate.academy

class LetterRemover private constructor() {

    companion object {
        @JvmStatic fun removeLetter(input: String): CharArray = input
            .map { if (it.lowercaseChar() == 'r') '!' else it.lowercaseChar() }
            .toCharArray()
    }

}
