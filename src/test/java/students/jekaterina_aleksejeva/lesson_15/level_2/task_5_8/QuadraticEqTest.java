package students.jekaterina_aleksejeva.lesson_15.level_2.task_5_8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {
    private QuadraticEq qeTest = new QuadraticEq();

    @Test
    void testDiscriminantGreaterThanZero() {
        String expected = "-1.0 and 7.0";
        String actual = qeTest.calc(1, -6, -7);
        assertEquals(expected, actual);

    }

    @Test
    void testDiscriminantGreaterThanZero_1() {
        String expected = "1.1903124474505034 and 58.79968755254949";
        String actual = qeTest.calc(10, -599.9, 699.9);
        assertEquals(expected, actual);

    }

    @Test
    void testDiscriminantEqualsZero() {
        String expected = " -10.0";
        String actual = qeTest.calc(1, 20, 100);
        assertEquals(expected, actual);

    }

    @Test
    void testDiscriminantEqualsZero_1() {
        String expected = " -1.0";
        String actual = qeTest.calc(1, 2, 1);
        assertEquals(expected, actual);

    }

    @Test
    void testDiscriminantLessThanZero() {
        String expected = "Equation has no roots";
        String actual = qeTest.calc(1.5, 2.5, 3.5);
        assertEquals(expected, actual);

    }

    @Test
    void testDiscriminantLessThanZero_1() {
        String expected = "Equation has no roots";
        String actual = qeTest.calc(88, -11.6, 3);
        assertEquals(expected, actual);

    }

}