package students.viktors_cesnokovs.lesson_15.level_2.task_5_8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class QuadraticEqTest {
    private final QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    void testPositiveDiscriminant() {
        double a = 5;
        double b = -15;
        double c = -20;
        String expected = "-1. 4";
        String result = quadraticEq.calc(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testDiscriminantEqualsZero() {
        double a = 1;
        double b = 8;
        double c = 16;
        String expected = "-4";
        String result = quadraticEq.calc(a, b, c);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testDiscriminantLessThanZero() {
        double a = 10;
        double b = 2;
        double c = 5;
        String expected = "Equation has no roots";
        String result = quadraticEq.calc(a, b, c);
        assertThat(result).isEqualTo(expected);
    }
}
