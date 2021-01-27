package students.viktors_cesnokovs.lesson_9.level_6.task_30;

class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.fraudTraderName1();
        test.fraudTraderName2();
        test.fraudTraderCity1();
        test.fraudTraderCity2();
        test.fraudTraderCountry1();
        test.fraudTraderCountry2();
        test.fraudTransaction1();
        test.fraudTransaction2();
        test.fraudTransaction3();
        test.fraudTransaction4();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    private boolean tester(boolean expected, boolean real) { return expected == real; }

    private final FraudRule[] fraudRules = {
            new FraudRule1("Rule Nr.1"),
            new FraudRule2("Rule Nr.2"),
            new FraudRule3("Rule Nr.3"),
            new FraudRule4("Rule Nr.4"),
            new FraudRule5("Rule Nr.5")
    };

    private final FraudDetector detector = new FraudDetector(fraudRules);

    private void fraudTraderName1() {
        System.out.println("Fraud trader test name 'YES' : " + result(
                tester(true, new FraudRule1("Rule Nr.1").isFraud(new Transaction
                        (new Trader("Pokemon", "Moscow", "Russia"), 1000)))));
    }

    private void fraudTraderName2() {
        System.out.println("Fraud trader test name 'NO' : " + result(
                tester(false, new FraudRule1("Rule Nr.1").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Russia"), 1000)))));
    }

    private void fraudTraderCity1() {
        System.out.println("Fraud trader test city 'YES' : " + result(
                tester(true, new FraudRule2("Rule Nr.2").isFraud(new Transaction
                        (new Trader("Igor", "Sidney", "Russia"), 1000)))));
    }

    private void fraudTraderCity2() {
        System.out.println("Fraud trader test city 'NO' : " + result(
                tester(false, new FraudRule2("Rule Nr.2").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Russia"), 1000)))));
    }

    private void fraudTraderCountry1() {
        System.out.println("Fraud trader test country 'YES' : " + result(
                tester(true, new FraudRule3("Rule Nr.3").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Jamaica"), 1000)))));
    }

    private void fraudTraderCountry2() {
        System.out.println("Fraud trader test country 'NO' : " + result(
                tester(false, new FraudRule3("Rule Nr.3").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Russia"), 1000)))));
    }

    private void fraudTransaction1() {
        System.out.println("Fraud transaction test 'YES' : " + result(
                tester(true, new FraudRule4("Rule Nr.4").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Russia"), 1100000)))));
    }

    private void fraudTransaction2() {
        System.out.println("Fraud transaction test 'NO' : " + result(
                tester(false, new FraudRule4("Rule Nr.4").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Russia"), 800000)))));
    }

    private void fraudTransaction3() {
        System.out.println("Fraud transaction test 'Germany , amount' 'YES' : " + result(
                tester(true, new FraudRule5("Rule Nr.5").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Germany"), 1100)))));
    }

    private void fraudTransaction4() {
        System.out.println("Fraud transaction test 'Germany , amount' 'NO' : " + result(
                tester(false, new FraudRule5("Rule Nr.5").isFraud(new Transaction
                        (new Trader("Igor", "Moscow", "Germany"), 800)))));
    }
}
