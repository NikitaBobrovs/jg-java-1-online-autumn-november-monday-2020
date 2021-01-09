package students.nikita_bobrovs.lesson_9.level_1.task_5;

class SafeV2 {
    private String password;  //cant be accessed from other class
    private double money;     //

    SafeV2(String passcode, double money) {
        this.password = passcode;
        this.money = money;
    }

    String getMoney(String password, double amount) {
        if (!this.password.equals(password)) {
            return "Denied. Incorrect password.";
        } else {
            this.money -= amount;
            return "Success. In safe now : " + this.money;
        }
    }

    String putMoney(String password, double amount) {
        if (!this.password.equals(password)) {
            return "Denied. Incorrect password.";
        } else {
            this.money += amount;
            return "Success. In safe now : " + this.money;
        }
    }
}
