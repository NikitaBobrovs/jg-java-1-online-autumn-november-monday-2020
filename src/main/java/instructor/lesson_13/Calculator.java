package instructor.lesson_13;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class CalculatorTest {

    // AAA
    public void should_add() {
        // Arrange
        Calculator subject = new Calculator();

        // Act
        int expected = 4;
        int actual = subject.sum(2, 2);

        // Assert
        if (expected == actual) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
