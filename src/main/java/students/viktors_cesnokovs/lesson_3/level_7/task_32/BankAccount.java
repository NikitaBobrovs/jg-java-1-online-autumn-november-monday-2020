package students.viktors_cesnokovs.lesson_3.level_7.task_32;

class BankAccount {

    String owner;
    int money;

    BankAccount(String owner , int money) {
        this.owner = owner;
        this.money = money;
    }
    String getOwner() { return this.owner; }
    String getMoney() { return String.valueOf(this.money); }

}

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String owner = bankAccount.getOwner();
        String money = bankAccount.getMoney();
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
    }

}
