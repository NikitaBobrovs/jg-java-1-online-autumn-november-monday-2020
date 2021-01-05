package students.jana_sergejenko.lesson_9.task_5;

public class Demo {
    public static void main(String[] args) {
        Safe test = new Safe ("qwerty",100.00);
        test.withdraw(10.00,"qwerty");
        System.out.println(test.getMoney());
    }
}
