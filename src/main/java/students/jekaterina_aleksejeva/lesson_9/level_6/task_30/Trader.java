package students.jekaterina_aleksejeva.lesson_9.level_6.task_30;

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

    @Override
    public String toString() {
        return "{" +
                "fullName ='" + fullName + '\'' +
                ", city = '" + city + '\'' +
                ", country = '" + country + '\'' +
                '}';
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

    @Override
    public String toString() {
        return "Fraudulent transaction details {" +
                "trader = " + trader +
                ", amount = " + amount +
                '}';
    }
}

class FraudDetector {

    private FraudRule[] rules;

    FraudDetector(FraudRule[] rules) {
        this.rules = rules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule : rules) {
            if (rule.isFraud(t)) {
                System.out.println("Transaction rejected, fraud type: " + rule.getRuleName());
                System.out.println(t.toString());
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        System.out.println("Transaction done, fraud check result: ");
        return null;
    }
}

class FraudDetectorDemo {
    public static void main(String[] args) {

        FraudRule[] demoRules = new FraudRule[]{
                new FraudRule1("Rule 1"),
                new FraudRule2("Rule 2"),
                new FraudRule3("Rule 3"),
                new FraudRule4("Rule 4"),
                new FraudRule5("Rule 5"),
        };

        FraudDetector demo = new FraudDetector(demoRules);
        System.out.println("FRAUD CHECK REPORT: ");
        System.out.println("------------------");
        Transaction trs = new Transaction(new Trader("Pokemon", "Sydney", "Germanyy"), 1005);
        System.out.println(demo.isFraud(trs));
        System.out.println("------------------");
        Transaction trs1 = new Transaction(new Trader("X", "Sidney", "Australia"), 37);
        System.out.println(demo.isFraud(trs1));
        System.out.println("------------------");
        Transaction trs2 = new Transaction(new Trader("James Bond", "Cardiff", "UK"), 1000);
        System.out.println(demo.isFraud(trs2));
    }

}

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.rule1Identified();
        test.rule2Identified();
        test.rule3Identified();
        test.rule4Identified();
        test.rule5Identified();
    }

    boolean checkBooleanTest(String expectedResult, String actualResult) {
        return expectedResult == actualResult;
    }

    FraudRule[] testRules = new FraudRule[]{
            new FraudRule1("Rule 1"),
            new FraudRule2("Rule 2"),
            new FraudRule3("Rule 3"),
            new FraudRule4("Rule 4"),
            new FraudRule5("Rule 5"),
    };

    FraudDetector fd = new FraudDetector(testRules);

    void rule1Identified() {
        Transaction trs = new Transaction(new Trader("Pokemon", "Athens", "Greece"), 105);
        if (checkBooleanTest("Rule 1", fd.isFraud(trs).getRuleName())) {
            System.out.println("Rule 1 identified and applied = PASS");
        } else {
            System.out.println("Rule 1 identified and applied = FAILED");
        }
    }

    void rule2Identified() {
        Transaction trs = new Transaction(new Trader("Deniz", "Moscow", "Russia"), 5000000);
        if (checkBooleanTest("Rule 2", fd.isFraud(trs).getRuleName())) {
            System.out.println("Rule 2 identified and applied = PASS");
        } else {
            System.out.println("Rule 2 identified and applied = FAILED");
        }
    }

    void rule3Identified() {
        Transaction trs = new Transaction(new Trader("John", "Sidney", "France"), 4855);
        if (checkBooleanTest("Rule 3", fd.isFraud(trs).getRuleName())) {
            System.out.println("Rule 3 identified and applied = PASS");
        } else {
            System.out.println("Rule 3 identified and applied = FAILED");
        }
    }

    void rule4Identified() {
        Transaction trs = new Transaction(new Trader("James", "Porto", "Jamaica"), 2);
        if (checkBooleanTest("Rule 4", fd.isFraud(trs).getRuleName())) {
            System.out.println("Rule 4 identified and applied = PASS");
        } else {
            System.out.println("Rule 4 identified and applied = FAILED");
        }
    }

    void rule5Identified() {
        Transaction trs = new Transaction(new Trader("Richard", "Dusseldorf", "Germany"), 3000);
        if (checkBooleanTest("Rule 5", fd.isFraud(trs).getRuleName())) {
            System.out.println("Rule 5 identified and applied = PASS");
        } else {
            System.out.println("Rule 5 identified and applied = FAILED");
        }
    }

}
