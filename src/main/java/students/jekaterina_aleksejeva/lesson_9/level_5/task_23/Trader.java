package students.jekaterina_aleksejeva.lesson_9.level_5.task_23;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}


class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}

class FraudDetector {

    private FraudRule[] rules;

    FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule rule : rules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.rule1FraudFound();
        test.rule2FraudFound();
        test.rule3FraudFound();
        test.rule4FraudFound();
        test.rule5FraudFound();
        test.rules1to5NoFraudFound();

    }

    FraudRule[] testRules = new FraudRule[]{
            new FraudRule1("Rule 1"),
            new FraudRule2("Rule 2"),
            new FraudRule3("Rule 3"),
            new FraudRule4("Rule 4"),
            new FraudRule5("Rule 5"),
    };

    FraudDetector fd = new FraudDetector(testRules);

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return expectedResult == actualResult;
    }

    void rule1FraudFound() {
        Transaction trs = new Transaction(new Trader("Pokemon", "Chicago", "USA"), 15);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Rule 1 execution: fraud detected = PASS");
        } else {
            System.out.println("Rule 1 execution: fraud detected = FAILED");
        }
    }

    void rule2FraudFound() {
        Transaction trs = new Transaction(new Trader("Li", "Hong Kong", "Hong Kong"), 9000000);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Rule 2 execution: fraud detected = PASS");
        } else {
            System.out.println("Rule 2 execution: fraud detected = FAILED");
        }
    }

    void rule3FraudFound() {
        Transaction trs = new Transaction(new Trader("Gregory", "Sidney", "Australia"), 687000);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Rule 3 execution: fraud detected = PASS");
        } else {
            System.out.println("Rule 3 execution: fraud detected = FAILED");
        }
    }

    void rule4FraudFound() {
        Transaction trs = new Transaction(new Trader("John", "Marine", "Jamaica"), 28);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Rule 4 execution: fraud detected = PASS");
        } else {
            System.out.println("Rule 4 execution: fraud detected = FAILED");
        }
    }

    void rule5FraudFound() {
        Transaction trs = new Transaction(new Trader("Bah", "Leipzig", "Germany"), 1001);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Rule 5 execution: fraud detected = PASS");
        } else {
            System.out.println("Rule 5 execution: fraud detected = FAILED");
        }
    }

    void rules1to5NoFraudFound() {
        Transaction trs = new Transaction(new Trader("ABC", "Riga", "Germany"), 1000);
        Transaction trs1 = new Transaction(new Trader("DEF", "Daugavpils", "Jamaika"), 28);
        Transaction trs2 = new Transaction(new Trader("GHI", "Sydney", "Australia"), 21);
        Transaction trs3 = new Transaction(new Trader("JKL", "Tallinn", "Estonia"), 1000000);
        Transaction trs4 = new Transaction(new Trader("Pakeman", "Vilnius", "Lithuania"), 1);

        if (checkBooleanTest(false, fd.isFraud(trs)) && checkBooleanTest(false, fd.isFraud(trs1)) &&
                checkBooleanTest(false, fd.isFraud(trs2)) && checkBooleanTest(false, fd.isFraud(trs3)) &&
                checkBooleanTest(false, fd.isFraud(trs4))) {
            System.out.println("Rule 1 to 5 execution: no fraud detected = PASS");
        } else {
            System.out.println("Rule 1 to 5 execution: no fraud detected = FAILED");
        }
    }

}
