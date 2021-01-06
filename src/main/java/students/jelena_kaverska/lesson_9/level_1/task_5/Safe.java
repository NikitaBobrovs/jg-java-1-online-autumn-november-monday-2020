package students.jelena_kaverska.lesson_9.level_1.task_5;

class Safe {
    private String pass;
    private double amount;

    public Safe(String pass, double amount) {
        this.pass = pass;
        this.amount = amount;
    }

    public boolean getMoney(String pass, double amount) {
        if (this.pass.equalsIgnoreCase(pass) && amount <= this.amount) {
            this.amount -= amount;
            return true;
        }
        return false;
    }

    public boolean putMoney(String pass, double amount) {
        if (this.pass.equalsIgnoreCase(pass)) {
            this.amount += amount;
            return true;
        }
        return false;
    }

    public double getAmount() {
        return amount;
    }

}
class MySafeDemo{

    public static void main(String[] args) {
        Safe s = new Safe("111", 100);
        System.out.println("Initial amount available: " + s.getAmount());
        System.out.println("Wrong pass and withdraw: " + s.getMoney("444", 50));
        System.out.println("Correct pass and withdraw 50: " + s.getMoney("111", 50));
        System.out.println("Current amount available: " + s.getAmount());
        System.out.println("------------------------------");
        System.out.println("Correct pass and deposit 12: " + s.putMoney("111", 12));
        System.out.println("Current amount available: " + s.getAmount());
        System.out.println("Wrong pass and deposit: " + s.putMoney("555", 15));
        System.out.println("Current amount unchanged: " + s.getAmount());
        System.out.println("------------------------------");
        System.out.println("Correct pass and not enough amount: " + s.getMoney("111", 500));
        System.out.println("Current amount unchanged: " + s.getAmount());
    }
}