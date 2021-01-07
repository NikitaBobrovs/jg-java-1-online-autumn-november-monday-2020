package students.polina_ivashkevich.lesson_2.level_3.task_11;

public class Arithmetic {
    public static void main(String[] args) {

        System.out.println(" Enter three integers numbers : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double a =scanner.nextDouble();
        System.out.println(a);
        double b =scanner.nextDouble();
        System.out.println(b);
        double c =scanner.nextDouble();
        System.out.println(c);
        double d= (a+b+c)/3;
        System.out.println(d);

    }
}
