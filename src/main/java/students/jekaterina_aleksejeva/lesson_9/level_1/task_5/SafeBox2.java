package students.jekaterina_aleksejeva.lesson_9.level_1.task_5;

class SafeBox2 {
    private int pin;
    private double balance;

    public SafeBox2(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public String getBalance() {
        return "Initial Balance = " + balance;
    }

    public String getMoney(int inputPin, double withdraw) {
        if (inputPin == pin && withdraw <= balance) {
            return "Withdraw amount = " + withdraw + ", updated balance = " + (balance - withdraw);
        } else {
            return "Access denied, enter valid PIN";
        }
    }

    public String putMoney(int inputPin, double credit) {
        if (inputPin == pin) {
            return "Credit amount = " + credit + ", updated balance = " + (balance + credit);
        } else {
            return "Access denied, enter valid PIN";
        }
    }
}

class SafeBox2Demo {
    public static void main(String[] args) {
        SafeBox2 demo = new SafeBox2(7890, 1000.50);
        System.out.println(demo.getBalance());

        System.out.println(demo.getMoney(7890, 1000));
        System.out.println(demo.getMoney(0000, 10));

        System.out.println(demo.putMoney(7890, 5000));
        System.out.println(demo.putMoney(1111, 20));
    }
}
