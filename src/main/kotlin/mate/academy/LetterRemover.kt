package mate.academy

@Suppress("UtilityClassWithPublicConstructor")
class LetterRemover {

    companion object {

        @JvmStatic
        fun removeLetter(input: String): CharArray =
            input
                .lowercase()
                .map { if (it == 'r') '!' else it }
                .toCharArray()
    }
}


