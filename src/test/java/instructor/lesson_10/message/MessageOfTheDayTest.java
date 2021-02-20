package instructor.lesson_10.message;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MessageOfTheDayTest {

    @Mock
    RandomGenerator randomGenerator;

    @Test
    public void should_return_hello_world() throws Exception {
        when(randomGenerator.nextInt(anyInt())).thenReturn(0);

        MessageOfTheDay subject = new MessageOfTheDay(randomGenerator);

        assertThat(subject.get()).isEqualTo(new Message("Hello World!"));
    }

    @Test
    public void should_return_lorem_ipsum() throws Exception {
//        RandomGenerator randomGenerator = mock(RandomGenerator.class);
        when(randomGenerator.nextInt(anyInt())).thenReturn(1);

        MessageOfTheDay subject = new MessageOfTheDay(randomGenerator);

        assertThat(subject.get()).isEqualTo(new Message("Lorem Ipsum!"));
    }

    @Test
    public void should_throw_exception_when_out_of_bounds() throws Exception {
//        RandomGenerator randomGenerator = mock(RandomGenerator.class);
        when(randomGenerator.nextInt(anyInt())).thenReturn(10);

        MessageOfTheDay subject = new MessageOfTheDay(randomGenerator);

        assertThatThrownBy(() -> subject.get())
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessage("Index 10 out of bounds for length 4");
    }
}
