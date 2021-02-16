package students.viktors_cesnokovs.lesson_9.level_5.task_22;

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
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        System.out.println("Fraud trader test name 'YES' : " + result(
                tester(true, detector.fraud(transaction))));
    }

    private void fraudTraderName2() {
        Trader trader = new Trader("Igor", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        System.out.println("Fraud trader test name 'NO' : " + result(
                tester(false, detector.fraud(transaction))));
    }

    private void fraudTraderCity1() {
        Trader trader = new Trader("Igor", "Sidney", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        System.out.println("Fraud trader test city 'YES' : " + result(
                tester(true, detector.fraud(transaction))));
    }

    private void fraudTraderCity2() {
        Trader trader = new Trader("Igor", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        System.out.println("Fraud trader test city 'NO' : " + result(
                tester(false, detector.fraud(transaction))));
    }

    private void fraudTraderCountry1() {
        Trader trader = new Trader("Igor", "Moscow", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        System.out.println("Fraud trader test country 'YES' : " + result(
                tester(true, detector.fraud(transaction))));
    }

    private void fraudTraderCountry2() {
        Trader trader = new Trader("Igor", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        System.out.println("Fraud trader test country 'NO' : " + result(
                tester(false, detector.fraud(transaction))));
    }

    private void fraudTransaction1() {
        Trader trader = new Trader("Igor", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 1100000);
        System.out.println("Fraud transaction test 'YES' : " + result(
                tester(true, detector.fraud(transaction))));
    }

    private void fraudTransaction2() {
        Trader trader = new Trader("Igor", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 800000);
        System.out.println("Fraud transaction test 'NO' : " + result(
                tester(false, detector.fraud(transaction))));
    }

    private void fraudTransaction3() {
        Trader trader = new Trader("Igor", "Moscow", "Germany");
        Transaction transaction = new Transaction(trader, 1100);
        System.out.println("Fraud transaction test 'Germany , amount' 'YES' : " + result(
                tester(true, detector.fraud(transaction))));
    }

    private void fraudTransaction4() {
        Trader trader = new Trader("Igor", "Moscow", "Germany");
        Transaction transaction = new Transaction(trader, 800);
        System.out.println("Fraud transaction test 'Germany , amount' 'NO' : " + result(
                tester(false, detector.fraud(transaction))));
    }
}
