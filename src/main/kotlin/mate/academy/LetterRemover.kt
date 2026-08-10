package mate.academy

import java.util.*

object LetterRemover {
    // Статичний метод, доступний в Java
    @JvmStatic
    fun removeLetter(input: String): CharArray {
        val lowercasedInput = input.lowercase(Locale.getDefault())
        val result = StringBuilder()

        for (c in lowercasedInput) {
            if (c == 'r') {
                result.append('!')
            } else {
                result.append(c)
            }
        }

        return result.toString().toCharArray()
    }
}
