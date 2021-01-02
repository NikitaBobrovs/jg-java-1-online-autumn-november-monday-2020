package students.jekaterina_aleksejeva.lesson_7.level_6.task_10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.changeCreditLimitPositiveAmount();
        test.changeCreditLimitNegativeAmount();
        test.changeCreditLimitValidPin();
        test.changeCreditLimitInvalidPin();
        test.changeCreditLimitZeroAmount();
        test.withdrawPositiveAmountLessThanBalanceNoDebt();
        test.withdrawNegativeAmountNoDebt();
        test.withdrawZeroAmountNoDebt();
        test.withdrawValidPin();
        test.withdrawInvalidPin();
        test.withdrawAmountEqualToBalance();
        test.withdrawAmountExceedingBalanceWithinCreditLimit();
        test.withdrawAmountEqualToSumOfBalanceAndCreditLimit();
        test.withdrawAmountExceedingBalanceOutOfCreditLimit();
        test.depositPositiveAmountNoDebt();
        test.depositNegativeAmount();
        test.depositZeroAmount();
        test.depositValidPin();
        test.depositInvalidPin();
        test.depositAmountLessThanDebtForZeroBalance();
        test.depositAmountEqualToDebtForZeroBalance();
        test.depositAmountExceedingDebtForZeroBalance();
        test.depositAmountForPositiveBalance();

    }

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return expectedResult == actualResult;
    }

    public void changeCreditLimitPositiveAmount() {
        CreditCard sample = new CreditCard(55555, 4444);
        if (checkBooleanTest(true, sample.changeCreditLimit(100, 4444))) {
            System.out.println("Credit Card Limit changed to 100 = PASS");
        } else {
            System.out.println("Credit Card Limit changed to 100 = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());

    }

    public void changeCreditLimitNegativeAmount() {
        if (checkBooleanTest(false, new CreditCard(11111, 2222).changeCreditLimit(-10, 2222))) {
            System.out.println("Credit Card Limit change to -10 rejected = PASS");
        } else {
            System.out.println("Credit Card Limit change - 10 rejected = FAILED");
        }

    }

    public void changeCreditLimitZeroAmount() {
        if (checkBooleanTest(false, new CreditCard(11111, 2222).changeCreditLimit(-10, 2222))) {
            System.out.println("Credit Card Limit change to 0 rejected = PASS");
        } else {
            System.out.println("Credit Card Limit change 0 rejected = FAILED");
        }

    }

    public void changeCreditLimitValidPin() {
        CreditCard sample = new CreditCard(33333, 1234);
        if (checkBooleanTest(true, sample.changeCreditLimit(50, 1234))) {
            System.out.println("Credit Card Limit change to 50 with correct pin = PASS");
        } else {
            System.out.println("Credit Card Limit change to 50 with correct pin = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void changeCreditLimitInvalidPin() {
        if (checkBooleanTest(false, new CreditCard(44444, 0007).changeCreditLimit(30, 7000))) {
            System.out.println("Credit Card Limit change to 30 rejected due to invalid pin = PASS");
        } else {
            System.out.println("Credit Card Limit change to 30 rejected due to invalid = FAILED");
        }

    }

    public void withdrawPositiveAmountLessThanBalanceNoDebt() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(true, sample.withdraw(10, 5555))) {
            System.out.println("Credit card withdraw in amount 10 less than balance 50, no debt = PASS");
        } else {
            System.out.println("Credit card withdraw in amount 10 less than balance 50, no debt = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());

    }

    public void withdrawNegativeAmountNoDebt() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(false, sample.withdraw(-10, 5555))) {
            System.out.println("Credit card withdraw in amount - 10 rejected = PASS");
        } else {
            System.out.println("Credit card withdraw in amount - 10 rejected = FAILED");
        }

    }

    public void withdrawZeroAmountNoDebt() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(false, sample.withdraw(0, 5555))) {
            System.out.println("Credit card withdraw in amount 0 rejected = PASS");
        } else {
            System.out.println("Credit card withdraw in amount 0 rejected = FAILED");
        }
    }

    public void withdrawValidPin() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(true, sample.withdraw(35, 5555))) {
            System.out.println("Credit card with balance 50 withdraw in amount 35, valid pin = PASS");
        } else {
            System.out.println("Credit card with balance 50 withdraw in amount 35, valid pin = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void withdrawInvalidPin() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(false, sample.withdraw(40, 5551))) {
            System.out.println("Credit card withdraw in amount 40 rejected due to invalid pin = PASS");
        } else {
            System.out.println("Credit card withdraw in amount 40 rejected due to invalid pin = FAILED");
        }
    }

    public void withdrawAmountEqualToBalance() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(true, sample.withdraw(50, 5555))) {
            System.out.println("Credit card withdraw in amount equal to balance = PASS");
        } else {
            System.out.println("Credit card withdraw in amount equal to balance = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void withdrawAmountExceedingBalanceWithinCreditLimit() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(true, sample.withdraw(70, 5555))) {
            System.out.println("Credit card withdraw in amount 70 exceeding balance 50 and within credit limit = PASS");
        } else {
            System.out.println("Credit card withdraw in amount 70 exceeding balance 50 and within credit limit = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void withdrawAmountEqualToSumOfBalanceAndCreditLimit() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(true, sample.withdraw(80, 5555))) {
            System.out.println("Credit card withdraw in amount 80 exceeding balance 50 and within credit limit 30 = PASS");
        } else {
            System.out.println("Credit card withdraw in amount 80 exceeding balance 50 and within credit limit 30 = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void withdrawAmountExceedingBalanceOutOfCreditLimit() {
        CreditCard sample = new CreditCard(77777, 5555);
        sample.changeCreditLimit(30, 5555);
        sample.deposit(50, 5555);
        if (checkBooleanTest(false, sample.withdraw(90, 5555))) {
            System.out.println("Credit card withdraw in amount 90 exceeding balance 50, out of credit limit rejected = PASS");
        } else {
            System.out.println("Credit card withdraw in amount 90 exceeding balance 50, out of credit limit rejected = FAILED");
        }
    }

    public void depositPositiveAmountNoDebt() {
        CreditCard sample = new CreditCard(88888, 4444);
        if (checkBooleanTest(true, sample.deposit(100, 4444))) {
            System.out.println("Credit card deposit in amount 100, no debt = PASS");
        } else {
            System.out.println("Credit card deposit in amount 100, no debt = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void depositNegativeAmount() {
        CreditCard sample = new CreditCard(88888, 4444);
        if (checkBooleanTest(false, sample.deposit(-50, 4444))) {
            System.out.println("Credit card deposit in amount -50 rejected = PASS");
        } else {
            System.out.println("Credit card deposit in amount -50 rejected = FAILED");
        }
    }

    public void depositZeroAmount() {
        CreditCard sample = new CreditCard(88888, 4444);
        if (checkBooleanTest(false, sample.deposit(0, 4444))) {
            System.out.println("Credit card deposit in amount 0 rejected = PASS");
        } else {
            System.out.println("Credit card deposit in amount 0 rejected = FAILED");
        }
    }

    public void depositValidPin() {
        CreditCard sample = new CreditCard(88888, 4444);
        if (checkBooleanTest(true, sample.deposit(500, 4444))) {
            System.out.println("Credit card deposit in amount 500, valid pin = PASS");
        } else {
            System.out.println("Credit card deposit in amount 500, valid pin = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void depositInvalidPin() {
        CreditCard sample = new CreditCard(88888, 4444);
        if (checkBooleanTest(false, sample.deposit(500, 88888))) {
            System.out.println("Credit card deposit rejected due to invalid pin = PASS");
        } else {
            System.out.println("Credit card deposit rejected due to invalid pin = FAILED");
        }
    }

    public void depositAmountLessThanDebtForZeroBalance() {
        CreditCard sample = new CreditCard(88888, 4444);
        sample.changeCreditLimit(50, 4444);
        sample.withdraw(30, 4444);
        if (checkBooleanTest(true, sample.deposit(20, 4444))) {
            System.out.println("Credit card deposit to zero balance in amount 20, which does not cover debt 30 in full  = PASS");
        } else {
            System.out.println("Credit card deposit to zero balance in amount 20, which does not cover debt 30 in full = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void depositAmountEqualToDebtForZeroBalance() {
        CreditCard sample = new CreditCard(88888, 4444);
        sample.changeCreditLimit(50, 4444);
        sample.withdraw(30, 4444);
        if (checkBooleanTest(true, sample.deposit(30, 4444))) {
            System.out.println("Credit card deposit to zero balance in amount 30 equal to debt 30 = PASS");
        } else {
            System.out.println("Credit card deposit to zero balance in amount 30 equal to debt 30 = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void depositAmountExceedingDebtForZeroBalance() {
        CreditCard sample = new CreditCard(88888, 4444);
        sample.changeCreditLimit(50, 4444);
        sample.withdraw(30, 4444);
        sample.getStatement();
        if (checkBooleanTest(true, sample.deposit(50, 4444))) {
            System.out.println("Credit card deposit to zero balance in amount 50 covering debt 30 and increasing balance to 20 = PASS");
        } else {
            System.out.println("Credit card deposit to zero balance in amount 50 covering debt 30 and increasing balance to 20 = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }

    public void depositAmountForPositiveBalance() {
        CreditCard sample = new CreditCard(88888, 4444);
        sample.changeCreditLimit(50, 4444);
        sample.deposit(100, 4444);
        sample.getStatement();
        if (checkBooleanTest(true, sample.deposit(50, 4444))) {
            System.out.println("Deposit 50 to credit card with balance 100 increasing total balance till 150 = PASS");
        } else {
            System.out.println("Deposit 50 to credit card with balance 100 increasing total balance till 150  = FAILED");
        }
        System.out.println("Updated statement: " + sample.getStatement());
    }


}
