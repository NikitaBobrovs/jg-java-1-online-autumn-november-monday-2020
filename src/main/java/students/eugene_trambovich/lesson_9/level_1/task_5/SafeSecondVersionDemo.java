package students.eugene_trambovich.lesson_9.level_1.task_5;

public class SafeSecondVersionDemo {

    public static void main(String[] args) {

        SafeSecondVersion safeSecondVersion = new SafeSecondVersion("7777e", 100.50);
        System.out.println("Balance is: " + safeSecondVersion.getBankAmount());
        System.out.println("safeSecondVersion.GetMoney(50) = " + safeSecondVersion.GetMoney("7777e", 50));
        System.out.println("Balance is: " + safeSecondVersion.getBankAmount());
        System.out.println("safeSecondVersion.PutMoney(100) = " + safeSecondVersion.PutMoney("7777e", 100));
        System.out.println("Balance is: " + safeSecondVersion.getBankAmount());
        System.out.println("safeSecondVersion.GetMoney(Wrong pass, 50) = " + safeSecondVersion.GetMoney("123", 50));
        System.out.println("Balance is: " + safeSecondVersion.getBankAmount());
        System.out.println("safeSecondVersion.PutMoney(Wrong pass, 100) = " + safeSecondVersion.PutMoney("321", 100));
        System.out.println("Balance is: " + safeSecondVersion.getBankAmount());
    }
}
