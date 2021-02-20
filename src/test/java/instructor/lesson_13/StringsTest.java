package instructor.lesson_13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class StringsTest {

    private final Strings subject = new Strings();

    @Test
    void should_sanitize_commas() {
        String expected = "hello world";
        String actual = subject.sanitize(",hello, world,");

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_sanitize_dots() {
        String actual = subject.sanitize(".hello. world.");
        assertThat(actual).isEqualTo("hello world");
    }

    @Test
    void should_sanitize_mixed() {
        String expected = "hello world";
        String actual = subject.sanitize("!hel*lo? #w,or$ld.");
        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            ",hello, world,",
            ".hello. world.",
            "!hello! world!",
            "@hello@ world@",
            "#hello# world#",
            "$hello$ world$",
            "%hello% world%",
            "^hello^ world^",
            "&hello& world&",
            "*hello* world*",
            "(hello( world(",
            ")hello) world)",
    })
    void happy_path(String text) {
        String actual = subject.sanitize(text);
        assertThat(actual).isEqualTo("hello world");
    }
}
