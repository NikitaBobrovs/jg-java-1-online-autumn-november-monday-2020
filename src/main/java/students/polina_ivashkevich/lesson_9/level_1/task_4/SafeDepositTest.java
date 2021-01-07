package students.polina_ivashkevich.lesson_9.level_1.task_4;

public class SafeDepositTest {
    public static void main(String[] args) {
        SafeDeposit safeDeposit = new SafeDeposit();
        if(safeDeposit.pinCode() !=6543) {
            System.out.println(safeDeposit.getPinCode(6645));
        }else {
            System.out.println("Not a problem");
        }
        if (safeDeposit.moneyCount()>=3) {
            System.out.println("Hack this count");
        }else {
            System.out.println("It is too few ");
        }


    }
}