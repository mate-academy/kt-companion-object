package mate.academy

@Suppress("UtilityClassWithPublicConstructor")
class LetterRemover {
    companion object {
        fun removeLetter(input: String): Array<Char> {
            return input
                .lowercase()
                .map { if (it == 'r') '!' else it }
                .toTypedArray()
        }
    }
}
