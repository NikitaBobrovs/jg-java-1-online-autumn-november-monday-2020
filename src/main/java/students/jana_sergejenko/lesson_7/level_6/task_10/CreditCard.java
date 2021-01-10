package students.jana_sergejenko.lesson_7.level_6.task_10;

public class CreditCard {
    private int number;
    private int pin;
    private double balance;
    private double creditlimit;
    private double debt;

    CreditCard(int number, int pin) {
        this.number = number;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public double getDebt() {
        return debt;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setDebt(double newDebt) {
        debt = newDebt;
    }

    public void setCreditLimit(double newCreditlimit) {
        creditlimit = newCreditlimit;
    }

    boolean checkPin(int pin1) {
        if (pin == pin1) {
            return true;
        }
        return false;
    }

    boolean withdraw(int pin, double amount) {
        if (!checkPin(pin)) {
            return false;
        }
        if (!isBalanceEnough(amount)) {
            if (!isBalanceCreditLimit(amount)) {
                return false;
            } else {
                debt = debt + (-(balance - amount));
                balance = 0;
                return true;
            }
        } else {
            balance = balance - amount;
            return true;
        }
    }

    boolean isBalanceEnough(double amount) {
        if (amount <= balance) {
            return true;
        }
        return false;
    }

    boolean isBalanceCreditLimit(double amount) {
        if (amount <= ((creditlimit - debt) + balance)) {
            return true;
        }

        return false;
    }

    boolean add(int pin, double amount) {
        if (!checkPin(pin)) {
            return false;
        } else {
            if (debt > 0) {
                debt = debt - amount;
                return true;
            }
            if (debt < 0) {
                balance = balance + (-debt);
                debt = 0;
                return true;
            } else {
                balance = balance + amount;
                return true;
            }
        }
    }


    public static void main(String[] args) {
        CreditCard test = new CreditCard(123456, 1234);
        test.setBalance(100);
        test.setDebt(0);
        test.setCreditLimit(1000);
        test.withdraw(1234, 999);
        System.out.println("Balance: " + test.getBalance());
        System.out.println("Debt: " + test.getDebt());
        test.add(12345, 100);

    }
}
