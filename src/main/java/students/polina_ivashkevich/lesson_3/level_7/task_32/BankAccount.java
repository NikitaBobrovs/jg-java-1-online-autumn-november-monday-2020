package students.polina_ivashkevich.lesson_3.level_7.task_32;

public class BankAccount {


    String owner="Viktor";
    int money;

        BankAccount (String owner,int money) {
            String moneyAmount = Integer.toString(money);


        }
            String getOwner() {

            return this.owner;
            }

            int getMoney () {

            return this.money;
            }

        }


    class BankAccountDemo {

        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", 100000);
            String ownerFirstName = bankAccount.getOwner();
            int moneyAmount = bankAccount.getMoney();
            System.out.println("Owner = " +ownerFirstName);
            System.out.println("Money = " + moneyAmount );
        }

    }


