package students.eugene_trambovich.lesson_9.level_1.task_5;

public class SafeSecondVersion {

    public String password;
    public double bankAmount;

    public SafeSecondVersion(String password, double bankAmount) {
        this.password = password;
        this.bankAmount = bankAmount;
    }

    public boolean GetMoney(String password, double bankAmount) {
        if (this.password.equalsIgnoreCase(password) && bankAmount <= this.bankAmount) {
            this.bankAmount -= bankAmount;
            return true;
        }
        return false;
    }

    public boolean PutMoney(String password, double bankAmount) {
        if (this.password.equalsIgnoreCase(password)) {
            this.bankAmount += bankAmount;
            return true;
        }
        return false;
    }

    public double getBankAmount() {
        return bankAmount;
    }
}
