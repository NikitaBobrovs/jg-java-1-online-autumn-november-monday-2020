package students.polina_ivashkevich.lesson_4.level_1.task_1;

public class Number {
    public static void main(String[] args) {

        java.util.Scanner Number = new java.util.Scanner(System.in);
        System.out.println("Enter whole number :");

        int wholeNumber = Number.nextInt();
        System.out.println("Whole number is :" + wholeNumber);


        if (wholeNumber< 0) {
            System.out.println("Whole number is a negative");
        }
        if (wholeNumber>0) {
            System.out.println("Whole number is a positive");
        }
    }
}
