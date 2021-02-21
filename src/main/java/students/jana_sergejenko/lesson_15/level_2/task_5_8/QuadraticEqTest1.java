package students.jana_sergejenko.lesson_15.level_2.task_5_8;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest1 {
    public static void main(String[] args) {
        QuadraticEqTest1 test = new QuadraticEqTest1();
        test.scenario1();
        test.scenario2();
        test.scenario3();
    }

    public void scenario1() {
        QuadraticEq qe = new QuadraticEq();
        assertEquals(qe.calc(8, 14, 3), "x1 = -1.5, x2 = -0.25");
    }

    public void scenario2() {
        QuadraticEq qe = new QuadraticEq();
        assertEquals(qe.calc(8, 1, 3), "Equation has no roots");
    }
    public void scenario3() {
        QuadraticEq qe = new QuadraticEq();
        assertEquals(qe.calc(1,2,1), "x = -1.0");
    }
}