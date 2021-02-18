package students.viktors_cesnokovs.lesson_13.level_5.task_26;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StringCalculatorTest {
    private final StringCalculator calculator = new StringCalculator();

    @Test
    public void testEmpty1() {
        String numbers = "";
        int exp = 0;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testEmpty2() {
        String numbers = " ";
        int exp = 0;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTwoNumbersSeparatedByCommaNoWhitespaces() {
        String numbers = "20,30";
        int exp = 50;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testTwoNumbersSeparatedByCommaWithWhitespaces() {
        String numbers = "20 , 30";
        int exp = 50;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testOneNumber() {
        String numbers = "20000";
        int exp = 20000;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testMultipleNumbers() {
        String numbers = "1 ,2,3 ,4,5,6, 7,8,9";
        int exp = 45;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testMultipleNumbersWithNewLine() {
        String numbers = "1\n23,4";
        int exp = 28;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testMultipleNumbersWithNewLine_1() {
        String numbers = "1\n23\n4";
        int exp = 28;
        int act = calculator.add(numbers);
        assertThat(act).isEqualTo(exp);
    }

    @Test
    public void testMultipleNumbersWithNewLine_2() {
        String numbers = "1\n";
        assertThatThrownBy(() -> calculator.add(numbers)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testMultipleNumbersWithNewLine_3() {
        String numbers = "\n";
        int act = calculator.add(numbers);
        int exp = 0;
        assertThat(act).isEqualTo(exp);
    }
}
