package students.eugene_trambovich.lesson_9.level_1.task_4;

public class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(55687, 854.567);
        String pin = String.valueOf(safe.pinCode);
        System.out.println("pin = " + pin);
        String bankAmount = String.valueOf(safe.bankAmount);
        System.out.println("bankAmount = " + bankAmount);
        safe.pinCode = 1234;
        safe.bankAmount = 25.385;
        System.out.println("safe.pinCode = " + safe.pinCode);
        System.out.println("safe.bankAmount = " + safe.bankAmount);
    }
}
