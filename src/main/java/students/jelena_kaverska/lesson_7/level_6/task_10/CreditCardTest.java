package students.jelena_kaverska.lesson_7.level_6.task_10;

class CreditCardTest {

    CreditCard creditCard;

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkBalance(double exp, double act) {
        return exp == act;
    }

    public boolean checkDebt(double exp, double act) {
        return exp == act;
    }

    public void testWithdrawWithIncorrectPin() {
        creditCard = new CreditCard("1234", "9876");
        boolean exp = false;
        boolean act = creditCard.withdraw("1234", 100);
        System.out.println("Withdraw with incorrect pin test: " + printResult(exp == act));
    }

    public void testWithdrawWithCorrectPin() {
        creditCard = new CreditCard("1234", "9876");
        boolean exp = true;
        boolean act = creditCard.withdraw("9876", 100);
        System.out.println("Withdraw with correct pin test: " + printResult(exp == act));
    }

    public void testWithdrawWithEnoughBalance() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.deposit("9876", 2000);
        boolean exp = true;
        boolean act = creditCard.withdraw("9876", 100);
        System.out.println("Withdraw with enough balance test: " + printResult(exp == act));
    }

    public void testWithdrawWithNotEnoughBalanceWithoutLimit() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.deposit("9876", 1000);
        boolean exp = true;
        boolean act = creditCard.withdraw("9876", 2000);
        System.out.println("Withdraw with not enough balance test: " + printResult(exp == act) +
                " + Balance update test: " + printResult(checkBalance(0, creditCard.getBalance())) +
                " + Debt update test: " + printResult(checkDebt(1000, creditCard.getDebt())));
    }

    public void testWithdrawWithNotEnoughBalanceOverLimit() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.deposit("9876", 875);
        creditCard.changeLimit("9876", 1000);
        creditCard.withdraw("9876", 2000);
        boolean exp = false;
        boolean act = creditCard.withdraw("9876", 1);
        System.out.println("Withdraw with current debt over limit test: " + printResult(exp == act));
    }

    public void testWithdrawWithNotEnoughBalanceDebtEqualsLimit() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.deposit("9876", 875);
        creditCard.changeLimit("9876", 1125);
        creditCard.withdraw("9876", 2000);
        boolean exp = true;
        boolean act = creditCard.withdraw("9876", 2000);
        System.out.println("Withdraw with current debt = limit test: " + printResult(exp == act));
    }

    public void testWithdrawWithNotEnoughBalanceDebtUnderLimit() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.deposit("9876", 875);
        creditCard.changeLimit("9876", 1500);
        creditCard.withdraw("9876", 2000);
        boolean exp = true;
        boolean act = creditCard.withdraw("9876", 2000);
        System.out.println("Withdraw with current debt under limit test: " + printResult(exp == act));
    }

    public void testChangeLimitWithCorrectPin() {
        creditCard = new CreditCard("1234", "9876");
        double limit = 5000;
        boolean exp = true;
        boolean act = creditCard.changeLimit("9876", limit);
        System.out.println("Limit change with correct pin test: " + printResult(exp == act) +
                " + Limit changed: " + printResult(limit == creditCard.getLimit()));
    }

    public void testChangeLimitWithInCorrectPin() {
        creditCard = new CreditCard("1234", "9876");
        double limit = 5000;
        boolean exp = false;
        boolean act = creditCard.changeLimit("9877", 5000);
        System.out.println("Limit change with incorrect pin test: " + printResult(exp == act) +
                " + Limit unchanged: " + printResult(limit != creditCard.getLimit()));
    }

    public void testDepositIncorrectPin() {
        creditCard = new CreditCard("1234", "9876");
        double amount = 100;
        boolean exp = false;
        boolean act = creditCard.deposit("1234", amount);
        System.out.println("Deposit with incorrect pin test: " + printResult(exp == act) +
                " + Balance unchanged: " + printResult(amount != creditCard.getBalance()));
    }

    public void testDepositWithCorrectPin() {
        creditCard = new CreditCard("1234", "9876");
        double amount = 100;
        boolean exp = true;
        boolean act = creditCard.deposit("9876", amount);
        System.out.println("Deposit with correct pin test: " + printResult(exp == act) +
                " + Balance changed: " + printResult(amount == creditCard.getBalance()));
    }

    public void testDepositToCoverDebtPartially() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.withdraw("9876", 1550.99);
        creditCard.deposit("9876", 1000);
        double expDebt = 550.99;
        System.out.println("Deposit covers debt partially - debt updated: " + printResult(expDebt == creditCard.getDebt()) +
                " balance unchanged: " + printResult(0 == creditCard.getBalance()));
    }

    public void testDepositToCoverDebtOnly() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.withdraw("9876", 1550.99);
        creditCard.deposit("9876", 1550.99);
        double expDebt = 0;
        System.out.println("Deposit covers debt only - debt 0: " + printResult(expDebt == creditCard.getDebt()) +
                " balance unchanged: " + printResult(0 == creditCard.getBalance()));
    }

    public void testDepositToCoverDebtAndAddBalance() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.withdraw("9876", 1550.99);
        creditCard.deposit("9876", 2000);
        double expBalance = 449.01;
        System.out.println("Deposit covers debt and adds balance - debt updated: " + printResult(0 == creditCard.getDebt()) +
                " balance changed: " + printResult(expBalance == creditCard.getBalance()));
    }

    public void testDepositWithNoDebt() {
        creditCard = new CreditCard("1234", "9876");
        creditCard.deposit("9876", 2000);
        double expBalance = 2000;
        System.out.println("Deposit adds balance: " + printResult(expBalance == creditCard.getBalance()));
    }

    public void testDepositNegativeAmount() {
        creditCard = new CreditCard("1234", "9876");
        boolean act = creditCard.deposit("9876", -10);
        System.out.println("Deposit negative amount: " + printResult(false == act));
    }

    public void testWithdrawNegativeAmount() {
        creditCard = new CreditCard("1234", "9876");
        boolean act = creditCard.withdraw("9876", -10);
        System.out.println("Withdraw negative amount: " + printResult(false == act));
    }

    public void testDeposit0() {
        creditCard = new CreditCard("1234", "9876");
        boolean act = creditCard.deposit("9876", 0);
        System.out.println("Deposit 0 amount: " + printResult(false == act));
    }

    public void testWithdraw0() {
        creditCard = new CreditCard("1234", "9876");
        boolean act = creditCard.withdraw("9876", 0);
        System.out.println("Withdraw 0 amount: " + printResult(false == act));
    }

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.testWithdrawWithIncorrectPin();
        test.testWithdrawWithCorrectPin();
        test.testWithdrawWithEnoughBalance();
        test.testWithdrawWithNotEnoughBalanceWithoutLimit();
        test.testWithdrawWithNotEnoughBalanceOverLimit();
        test.testWithdrawWithNotEnoughBalanceDebtEqualsLimit();
        test.testWithdrawWithNotEnoughBalanceDebtUnderLimit();
        test.testChangeLimitWithCorrectPin();
        test.testChangeLimitWithInCorrectPin();
        test.testDepositIncorrectPin();
        test.testDepositWithCorrectPin();
        test.testDepositToCoverDebtPartially();
        test.testDepositToCoverDebtOnly();
        test.testDepositToCoverDebtAndAddBalance();
        test.testDepositWithNoDebt();
        test.testDepositNegativeAmount();
        test.testWithdrawNegativeAmount();
        test.testDeposit0();
        test.testWithdraw0();
    }
}