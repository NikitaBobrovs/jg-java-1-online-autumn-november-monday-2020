package instructor.lesson_12;

public class RuntimeExceptionDemo {

    public static void main(String[] args) {

        System.out.println("The start");

        System.out.println(convert("Foo"));
        System.out.println(convert(null));

        System.out.println("The finish");
    }

    public static String convert(String string) {
        return string.toUpperCase();
    }
}
