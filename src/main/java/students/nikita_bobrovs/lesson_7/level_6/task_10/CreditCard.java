package students.nikita_bobrovs.lesson_7.level_6.task_10;

class CreditCard {
    CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        balance = 0;
        debt = 0;
    }

    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double debt;

    public double getDebt() {
        return debt;
    }
    public double getBalance() {
        return balance;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getPinCode() {
        return pinCode;
    }


    void changeCreditLimit(double newLimit) {
        creditLimit = newLimit;
    }

    boolean isPinCodeCorrect(String pinCode) {
        return !this.pinCode.equals(pinCode);
    }

    String withdraw(String pinCode, double amount) {
        if (isPinCodeCorrect(pinCode)) {
            return "Declined. Incorrect pin code.";
        }
        if (amount <= balance) {
            balance -= amount;
            return "Withdraw successful.";
        }
        if (amount > balance) {
            if (-(balance - amount) > creditLimit) {
                return "Declined. Exceeding credit limit.";
            } else {
                balance += -amount;
                debt += -balance;
                balance += -balance;
            }
        }
        return "Withdraw successful.";
    }

    String deposit(String pinCode, double amount) {
        if (isPinCodeCorrect(pinCode)) {
            return "Declined. Incorrect pin code.";
        }
        if (debt > 0) {
            debt -= amount;
            if (debt < 0) {
                balance += -debt;
                debt += -debt;
            }
        } else {
            balance += amount;
        }
        return "Funds added.";
    }
}
