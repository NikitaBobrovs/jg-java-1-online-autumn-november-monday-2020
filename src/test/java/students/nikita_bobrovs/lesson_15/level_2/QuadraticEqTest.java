package students.nikita_bobrovs.lesson_15.level_2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticEqTest {
    @Test
    void discriminantGreaterThanZeroTest(){
    QuadraticEq quadraticEq = new QuadraticEq(1,-5,2);
        Assertions.assertThat(quadraticEq.calc()).isEqualTo("x1 = 0.4384471871911697, x2 = 4.561552812808831");
    }

    @Test
    void discriminantEqualsThanZeroTest(){
        QuadraticEq quadraticEq = new QuadraticEq(1,2,1);
        Assertions.assertThat(quadraticEq.calc()).isEqualTo("x = -1.0");
    }

    @Test
    void discriminantLessThanZero(){
        QuadraticEq quadraticEq = new QuadraticEq(3,2,1);
        Assertions.assertThat(quadraticEq.calc()).isEqualTo("Equation has no roots");
    }
}