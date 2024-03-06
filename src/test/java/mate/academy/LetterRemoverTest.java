package mate.academy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LetterRemoverTest {

    @Test
    void removeLetter_InputStringContainsNoLetterR_ReturnsOriginalString() {
        // given
        String input = "hello";
        char[] expected = "hello".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsOnlyOneOccurrenceOfTheLetterR_Ok() {
        // given
        String input = "river";
        char[] expected = "!ive!".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsMultipleOccurrencesOfTheLetterR_Ok() {
        // given
        String input = "rural";
        char[] expected = "!u!al".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringIsEmpty_ReturnsEmptyCharArray() {
        // given
        String input = "";
        char[] expected = "".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsOnlyTheLetterR_Ok() {
        // given
        String input = "rrr";
        char[] expected = "!!!".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsLettersInUppercase_Ok() {
        // given
        String input = "RIVER";
        char[] expected = "!ive!".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsLettersInAMixOfUppercaseAndLowercase_Ok() {
        // given
        String input = "RuRal";
        char[] expected = "!u!al".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsNonAlphabetCharactersAlongWithR_Ok() {
        // given
        String input = "r3d r!se";
        char[] expected = "!3d !!se".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeLetter_InputStringContainsNonAlphabetCharactersOnly_ReturnsOriginalString() {
        // given
        String input = "123 !@#";
        char[] expected = "123 !@#".toCharArray();

        // when
        char[] actual = LetterRemover.removeLetter(input);

        // then
        assertArrayEquals(expected, actual);
    }
}
