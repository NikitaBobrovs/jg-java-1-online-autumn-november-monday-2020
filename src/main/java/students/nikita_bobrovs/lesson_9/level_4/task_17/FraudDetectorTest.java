package students.nikita_bobrovs.lesson_9.level_4.task_17;

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

    private final FraudDetector subject = new FraudDetector();
    private final IsFraudTrader isFraudTrader = new IsFraudTrader();
    private final IsFraudTransaction isFraudTransaction = new IsFraudTransaction();

    private void isFraudTraderName1() {
        Trader trader = new Trader("pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);

        System.out.println("Is fraud traded test (yes) (name) : " + testResult(tester
                (true, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTraderName2() {
        Trader trader = new Trader("Edgars", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);

        System.out.println("Is fraud traded test (no) (name) : " + testResult(tester
                (false, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTraderCity1() {
        Trader trader = new Trader("Edgars", "Sidney", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);

        System.out.println("Is fraud trader test (yes) (city) : " + testResult(tester
                (true, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTraderCity2() {
        Trader trader = new Trader("Edgars", "Orange", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);

        System.out.println("Is fraud trader test (no) (city) : " + testResult(tester
                (false, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTraderCountry1() {
        Trader trader = new Trader("Edgars", "Paris", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);

        System.out.println("Is fraud trader test (yes) (country) : " + testResult(tester
                (true, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTraderCountry2() {
        Trader trader = new Trader("Edgars", "Paris", "France");
        Transaction transaction = new Transaction(trader, 1000);

        System.out.println("Is fraud trader test (no) (country) : " + testResult(tester
                (false, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTransaction1() {
        Trader trader = new Trader("Edgars", "Paris", "France");
        Transaction transaction = new Transaction(trader, 1000001);

        System.out.println("Is fraud transaction test (yes) (amount) : " + testResult(tester
                (true, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTransaction2() {
        Trader trader = new Trader("Edgars", "Paris", "France");
        Transaction transaction = new Transaction(trader, 999999);

        System.out.println("Is fraud transaction test (no) (amount) : " + testResult(tester
                (false, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTransaction3() {
        Trader trader = new Trader("Edgars", "Paris", "Germany");
        Transaction transaction = new Transaction(trader, 1001);

        System.out.println("Is fraud transaction test (yes) (German + amount) : " + testResult(tester
                (true, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }

    private void isFraudTransaction4() {
        Trader trader = new Trader("Edgars", "Paris", "germany");
        Transaction transaction = new Transaction(trader, 999);

        System.out.println("Is fraud transaction test (no) (German + amount) : " + testResult(tester
                (false, subject.isFraud(transaction, isFraudTrader, isFraudTransaction))));
    }
}
