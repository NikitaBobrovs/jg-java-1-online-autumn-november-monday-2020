package students.polina_ivashkevich.lesson_2.level_3.task_11;

public class Integer {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double Integer1 = scanner.nextDouble();
        System.out.println(Integer1);
        double Integer2 = scanner.nextDouble();
        System.out.println(Integer2);
        double Integer3 = scanner.nextDouble();
        System.out.println(Integer3);

        System.out.println("Среднее арифметическое : " + (Integer1+Integer2+Integer3)/3);

    }
}
