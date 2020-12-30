package students.jekaterina_aleksejeva.lesson_7.level_6.task_10;

class CreditCard {
    private int number;
    private int pin;
    private double balance;
    private double creditLimit;
    private double debt;

    CreditCard(int number, int pin) {
        this.number = number;
        this.pin = pin;
        this.balance = 0;
        this.debt = 0;
    }

    public boolean changeCreditLimit(double changeLimit, int pin) {
        if (pin != this.pin || changeLimit <= 0) {
            return false;
        } else {
            creditLimit = changeLimit;
        }
        return true;

    }


    public boolean withdraw(double amount, int pin) {
        if (pin != this.pin || amount <= 0) {
            return false;
        } else {
            if (amount <= balance) {
                balance = balance - amount;
                return true;
            } else if (-(balance - amount) <= creditLimit) {
                debt = debt - (balance - amount);
                balance = 0;
                return true;
            }

        }
        return false;
    }

    public boolean deposit(double amount, int pin) {
        if (pin != this.pin || amount <= 0) {
            return false;
        } else {
            if (debt == 0) {
                balance = balance + amount;
                return true;

            } else if (balance == 0 && amount <= debt) {
                debt = debt - amount;
                return true;
            } else {
                balance = balance + (amount - debt);
                debt = 0;
                return true;
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getDebt() {
        return debt;
    }

    public String getStatement() {
        return "Balance = " + getBalance() + ", " + "Credit Limit = " + getCreditLimit() + ", " + " Debt = " + getDebt();
    }
}



