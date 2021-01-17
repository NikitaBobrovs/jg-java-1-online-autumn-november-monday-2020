package students.viktors_cesnokovs.lesson_9.level_1.task_4;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        System.out.println("Password : " + safe.pinCode);
        System.out.println("Money amount : " + safe.money + " EUR");
    }
}
