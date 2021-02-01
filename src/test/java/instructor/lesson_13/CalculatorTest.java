package instructor.lesson_13;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

//    private Calculator subject;

//    @Before
//    public void setUp() throws Exception {
//        System.out.println("setUp!");
//        subject = new Calculator();
//    }

    @Test
    public void should_add() {
        // Arrange
        Calculator subject = new Calculator();

        // Act
        int expected = 4;
        int actual = subject.sum(2, 2);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void should_subtract() {
        // Arrange
        Calculator subject = new Calculator();

        // Act
        int expected = 6;
        int actual = subject.sub(10, 4);

        // Assert
        assertThat(actual).isEqualTo(expected);
    }
}
