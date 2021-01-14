package students.jekaterina_aleksejeva.lesson_9.level_1.task_4;

class SafeBox {
    public int pin;
    public double balance;

}

class SafeBoxDemo {
    public static void main(String[] args) {
        SafeBox demo = new SafeBox();
        System.out.println("Initial Safe Box statement: " + "PIN: " + demo.pin + " and balance, EUR: " + demo.balance);
        demo.pin = 7777;
        demo.balance = 1000000;
        System.out.println("Updated Safe Box statement: " + "current PIN: " + demo.pin + " and current balance, EUR: " + demo.balance);

    }
}
