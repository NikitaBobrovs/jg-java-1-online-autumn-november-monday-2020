package students.polina_ivashkevich.lesson_6.level_1.task_6;

public class NumberUtils {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

}

class NumberUtilsTest{


    private static boolean isEven;

    public static void main(String[] args) {
        System.out.println("Test "+isEven);

    }
}