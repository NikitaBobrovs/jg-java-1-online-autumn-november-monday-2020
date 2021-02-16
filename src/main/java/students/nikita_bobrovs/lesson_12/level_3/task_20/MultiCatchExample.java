package students.nikita_bobrovs.lesson_12.level_3.task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
        }

        catch (ArithmeticException a) {
        }

        catch (Exception e) {
        }
    }
    // ArithmeticException extends RuntimeException, which extends Exception
    // cant call subclass exception, if super will catch that, before its called
}
