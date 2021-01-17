package students.viktors_cesnokovs.lesson_9.level_1.task_5;

public class Safe2 {
    private String pinCode;
    private double money;

    Safe2(String pass, double money) {
        this.pinCode = pass;
        this.money = money;
    }

    String getMoney(String pinCode, double balance) {
        if (!this.pinCode.equals(pinCode)) {
            return "Access denied.";
        } else {
            this.money -= balance;
            return "Access granted. Balance amount : " + this.money;
        }
    }

    String putMoney(String pinCode, double balance) {
        if (!this.pinCode.equals(pinCode)) {
            return "Access denied.";
        } else {
            this.money += balance;
            return "Access granted. Balance amount : " + this.money;
        }
    }
}
