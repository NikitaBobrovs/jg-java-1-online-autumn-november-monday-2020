package students.jana_sergejenko.lesson_12.level_3.task_20;

public class MultiCatchExample {
    public static void main(String[] args) {
//This first handler catches exceptions of type Exception; therefore, it catches any exception, including ArithmeticException.
// The second handler could never be reached. Old code will not compile.
        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        }

    }
}