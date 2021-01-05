package students.jana_sergejenko.lesson_9.task_5;

class Safe {
    private String password;
    private double money;

    public Safe(String password, double money) {
        this.password = password;
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }

    public void putMoney(double deposit) {
        money += deposit;
    }

    public void withdraw(double withdraw, String pass) {
        if (password.equals(pass)) {
            money -= withdraw;
        }else {
            System.out.println("You can't withdraw");
        }

    }
}
