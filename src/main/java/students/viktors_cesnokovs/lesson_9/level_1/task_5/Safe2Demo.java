package students.viktors_cesnokovs.lesson_9.level_1.task_5;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 safe = new Safe2("qwerty", 100.0);

        System.out.println(safe.getMoney("qwerty", 20.00));
        System.out.println(safe.putMoney("qwerty", 50.00));

        System.out.println(safe.getMoney("qawsed", 100.00));
        System.out.println(safe.putMoney("qawsed", 100.00));
    }
}
