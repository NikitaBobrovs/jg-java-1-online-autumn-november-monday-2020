package students.jana_sergejenko.lesson_7.level_6.task_10;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
        test.scenario6();
        test.scenario7();
    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        CreditCard test = new CreditCard(1234, 899);
        test.setBalance(200);
        test.setCreditLimit(1000);
        boolean result = test.withdraw(123, 100);
        boolean expected = false;
        System.out.println("Incorrect PIN result " + checkResult(result, expected));
    }

    public void scenario2() {
        CreditCard test = new CreditCard(1234, 111);
        test.setBalance(200);
        test.setCreditLimit(100);
        boolean result = test.withdraw(111, 400);
        boolean expected = false;
        System.out.println("Not enough creditlimit " + checkResult(result, expected));
    }

    public void scenario3() {
        CreditCard test = new CreditCard(1234, 111);
        test.setBalance(200);
        test.setCreditLimit(200);
        //System.out.println(test.isBalanceCreditLimit(400));
        //System.out.println(test.getCreditlimit());
        //System.out.println(test.getBalance());
        //System.out.println(test.getDebt());
        boolean result = test.withdraw(111, 400);
        boolean expected = true;
        System.out.println("Not enough balance, but enough with creditlimit " + checkResult(result, expected));
    }

    public void scenario4() {
        CreditCard test = new CreditCard(1234, 111);
        test.setBalance(200);
        test.setCreditLimit(200);
        test.setDebt(100);
        //System.out.println(test.isBalanceCreditLimit(400));
        //System.out.println(test.getCreditlimit());
        //System.out.println(test.getBalance());
        //System.out.println(test.getDebt());
        boolean result = test.withdraw(111, 400);
        boolean expected = false;
        System.out.println("Not enough balance and not enogh creditlimit(has debt) " + checkResult(result, expected));
    }

    public void scenario5() {
        CreditCard test = new CreditCard(1234, 111);
        test.setBalance(200);
        test.setCreditLimit(200);
        test.setDebt(100);
        //System.out.println(test.isBalanceCreditLimit(400));
        //System.out.println(test.getCreditlimit());
        //System.out.println(test.getBalance());
        //System.out.println(test.getDebt());
        boolean result = test.add(123, 20.00);
        boolean expected = false;
        System.out.println("Deposit wrong pin " + checkResult(result, expected));
    }

    public void scenario6() {
        CreditCard test = new CreditCard(1234, 111);
        test.setBalance(200);
        test.setDebt(100);
        System.out.println("limit:" + test.getCreditlimit());
        System.out.println("balance:" + test.getBalance());
        System.out.println("debt:" + test.getDebt());
        boolean result = test.add(111, 100.00);
        System.out.println("limit:" + test.getCreditlimit());
        System.out.println("balance:" + test.getBalance());
        System.out.println("debt:" + test.getDebt());
        boolean expected = true;
        System.out.println("Deposit. Has debt. Cover debt in full. " + checkResult(result, expected));
    }

    public void scenario7() {
        CreditCard test = new CreditCard(1234, 111);
        test.setBalance(200);
        System.out.println("limit:" + test.getCreditlimit());
        System.out.println("balance:" + test.getBalance());
        System.out.println("debt:" + test.getDebt());
        boolean result = test.add(111, 100.00);
        System.out.println("limit:" + test.getCreditlimit());
        System.out.println("balance:" + test.getBalance());
        System.out.println("debt:" + test.getDebt());
        boolean expected = true;
        System.out.println("No debt. Increase balance " + checkResult(result, expected));
    }
}
