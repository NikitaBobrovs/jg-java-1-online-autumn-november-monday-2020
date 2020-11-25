package students.polina_ivashkevich.lesson_3.level_7.task_32;

public class BankAccount {
    String owner;
        int money;

        BankAccount(int moneyAmount) {
            this.owner = owner;
            owner = "Viktor";
            this.money = money;
            money = 1000;
        }

        String getOwner() {
            return this.owner;
        }

            int getMoney() {
            return this.money;
        }

    }

    class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount(1000);
            String ownerFirstName = bankAccount.getOwner();
            int moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " + bankAccount.getOwner());
            System.out.println("Money = " + bankAccount.getMoney());
        }

    }


