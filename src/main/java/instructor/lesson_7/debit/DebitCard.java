package instructor.lesson_7.debit;

class DebitCard {

    private double balance;

    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        }

        balance += amount; // balance = balance + amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            return false;
        }

        if (balance < amount) {
            return false;
        }

        balance -= amount; // balance = balance - amount;
        return true;
    }

    public double balance() {
        return balance;
    }
}
