package students.polina_ivashkevich.lesson_15.level_2.task_5;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class QuadraticEqTest {
    private final QuadraticEq eq = new QuadraticEq();


    @Test
    void testDiscriminantPositive() {
        double a = 1;
        double b = -2;
        double c = -3;
        String exp = "-1, 3";
        String act = eq.calc(a, b, c);
        assertThat (act).isEqualTo(exp);
    }


    @Test
    void testDiscriminantPositive_1() {
        double a = 1;
        double b = 12;
        double c = 36;
        String exp = "-6";
        String act = eq.calc(a, b, c);
        assertThat(act).isEqualTo(exp);
    }
    @Test
    void testDiscriminantEqualsZero() {
        double a = 1;
        double b = 12;
        double c = 36;
        String exp = "-6";
        String act = eq.calc(a, b, c);
        assertThat(act).isEqualTo(exp);
    }
    @Test
    void testDiscriminantNegative() {
        double a = 5;
        double b = 3;
        double c = 7;
        String exp = "Equation has no roots";
        String act = eq.calc(a, b, c);
        assertThat(act).isEqualTo(exp);
    }
}
