package students.nikita_bobrovs.lesson_7.level_6.task_10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest subject = new CreditCardTest();
        subject.changeCreditLimitTest();
        subject.isPinCodeCorrectTest1();
        subject.withdrawTest1();
        subject.withdrawTest2();
        subject.withdrawTest3();
        subject.withdrawTest4();
        subject.withdrawTest5();
        subject.withdrawTest6();
        subject.depositTest1();
        subject.depositTest2();
        subject.depositTest3();
        subject.depositTest4();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    boolean doubleTester(double expectedResult, double realResult) {
        return expectedResult == realResult;
    }

    boolean stringTester(String expectedResult, String realResult) {
        return expectedResult.equals(realResult);
    }

    boolean withdrawDepositTester(double expectedDebt, double realDebt, double expectedBalance, double realBalance) {
        return expectedDebt == realDebt && expectedBalance == realBalance;
    }

    void changeCreditLimitTest() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        System.out.println("Change credit limit test : " + testResult(doubleTester
                (10, card.getCreditLimit())));
    }

    void isPinCodeCorrectTest1() {
        CreditCard card = new CreditCard("112233", "1111");
        System.out.println("Is pin code correct test (yes) : " + testResult(stringTester
                ("1111", card.getPinCode())));
    }

    void withdrawTest1() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        card.withdraw("1111", 5);
        System.out.println("Withdraw test go in debt (from balance = 0; debt = 0) : " + testResult(withdrawDepositTester
                (5, card.getDebt(), 0, card.getBalance())));
    }

    void withdrawTest2() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        card.deposit("1111", 10);
        card.withdraw("1111", 5);
        System.out.println("Withdraw test without debt (from balance = 10; debt = 0) : " + testResult(withdrawDepositTester
                (0, card.getDebt(), 5, card.getBalance())));
    }

    void withdrawTest3() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        card.deposit("1111", 10);
        card.withdraw("1111", 30);
        System.out.println("Withdraw test over limit(from balance = 10; debt = 0) : " + testResult(withdrawDepositTester
                (0, card.getDebt(), 10, card.getBalance())));
    }

    void withdrawTest4() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        System.out.println("Withdraw message test(successful) : " + testResult(stringTester
                ("Withdraw successful.", card.withdraw("1111", 10))));
    }

    void withdrawTest5() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        System.out.println("Withdraw message test(declined) : " + testResult(stringTester
                ("Declined. Exceeding credit limit.", card.withdraw("1111", 20))));
    }

    void withdrawTest6() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        System.out.println("Withdraw message test(declined = wrong pin) : " + testResult(stringTester
                ("Declined. Incorrect pin code.", card.withdraw("2222", 10))));
    }

    void depositTest1() {
        CreditCard card = new CreditCard("112233", "1111");
        card.deposit("1111", 20);
        System.out.println("Deposit test (balance = 0; debt = 0) : " + testResult(withdrawDepositTester
                (0, card.getDebt(), 20, card.getBalance())));
    }

    void depositTest2() {
        CreditCard card = new CreditCard("112233", "1111");
        card.changeCreditLimit(10);
        card.withdraw("1111", 10);
        card.deposit("1111", 20);
        System.out.println("Deposit test (balance = 0; debt = 10) : " + testResult(withdrawDepositTester
                (0, card.getDebt(), 10, card.getBalance())));
    }

    void depositTest3() {
        CreditCard card = new CreditCard("112233", "1111");
        System.out.println("Deposit message test(funds added) : " + testResult(stringTester
                ("Funds added.", card.deposit("1111", 50))));
    }

    void depositTest4() {
        CreditCard card = new CreditCard("112233", "1111");
        System.out.println("Deposit message test(declined -wrong pin) : " + testResult(stringTester
                ("Declined. Incorrect pin code.", card.deposit("2222", 50))));
    }
}
