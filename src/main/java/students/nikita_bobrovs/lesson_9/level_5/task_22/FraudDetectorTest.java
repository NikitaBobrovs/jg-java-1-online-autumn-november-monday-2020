package students.nikita_bobrovs.lesson_9.level_5.task_22;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest subject = new FraudDetectorTest();
        subject.isFraudTraderName1();
        subject.isFraudTraderName2();
        subject.isFraudTraderCity1();
        subject.isFraudTraderCity2();
        subject.isFraudTraderCountry1();
        subject.isFraudTraderCountry2();
        subject.isFraudTransaction1();
        subject.isFraudTransaction2();
        subject.isFraudTransaction3();
        subject.isFraudTransaction4();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private boolean tester(boolean expected, boolean real) {
        return expected == real;
    }

    private final FraudRule[] fraudRules = {
            new FraudRule1("rule1"),
            new FraudRule2("rule2"),
            new FraudRule3("rule3"),
            new FraudRule4("rule4"),
            new FraudRule5("rule5")
    };

    private final FraudDetector subject = new FraudDetector(fraudRules);

    private void isFraudTraderName1() {
        Transaction t = new Transaction(new Trader("pokemon", "Riga", "Latvia"), 1000);

        System.out.println("Is fraud traded test (yes) (name) : " + testResult(tester
                (true, subject.isFraud(t))));
    }

    private void isFraudTraderName2() {
        Transaction t = new Transaction(new Trader("Edgars", "Riga", "Latvia"), 1000);

        System.out.println("Is fraud traded test (no) (name) : " + testResult(tester
                (false, subject.isFraud(t))));
    }

    private void isFraudTraderCity1() {
        Transaction t = new Transaction(new Trader("Edgars", "Sidney", "Latvia"), 1000);

        System.out.println("Is fraud trader test (yes) (city) : " + testResult(tester
                (true, subject.isFraud(t))));
    }

    private void isFraudTraderCity2() {
        Transaction t = new Transaction(new Trader("Edgars", "Orange", "Latvia"), 1000);

        System.out.println("Is fraud trader test (no) (city) : " + testResult(tester
                (false, subject.isFraud(t))));
    }

    private void isFraudTraderCountry1() {
        Transaction t = new Transaction(new Trader("Edgars", "Paris", "Jamaica"), 1000);

        System.out.println("Is fraud trader test (yes) (country) : " + testResult(tester
                (true, subject.isFraud(t))));
    }

    private void isFraudTraderCountry2() {
        Transaction t = new Transaction(new Trader("Edgars", "Paris", "France"), 1000);

        System.out.println("Is fraud trader test (no) (country) : " + testResult(tester
                (false, subject.isFraud(t))));
    }

    private void isFraudTransaction1() {
        Transaction t = new Transaction(new Trader("Edgars", "Paris", "France"), 1000001);

        System.out.println("Is fraud transaction test (yes) (amount) : " + testResult(tester
                (true, subject.isFraud(t))));
    }

    private void isFraudTransaction2() {
        Transaction t = new Transaction(new Trader("Edgars", "Paris", "France"), 999999);

        System.out.println("Is fraud transaction test (no) (amount) : " + testResult(tester
                (false, subject.isFraud(t))));
    }

    private void isFraudTransaction3() {
        Transaction t = new Transaction(new Trader("Edgars", "Paris", "Germany"), 1001);

        System.out.println("Is fraud transaction test (yes) (German + amount) : " + testResult(tester
                (true, subject.isFraud(t))));
    }

    private void isFraudTransaction4() {
        Transaction t = new Transaction(new Trader("Edgars", "Paris", "germany"), 999);

        System.out.println("Is fraud transaction test (no) (German + amount) : " + testResult(tester
                (false, subject.isFraud(t))));
    }
}