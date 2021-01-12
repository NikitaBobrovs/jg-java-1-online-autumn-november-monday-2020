package students.jelena_kaverska.lesson_9.level_5_6;

import java.util.List;

class FraudDetector {

    private final List<FraudRule> fraudRules;

    FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    public List<FraudRule> getFraudRules() {
        return fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        System.out.println("No fraud transaction");
        return null;
    }
}

class MyTest {
    public static void main(String[] args) {

        Transaction tr1 = new Transaction(new Trader("pokemon1", "Sydney1", "UK"), 500);
        FraudDetector fd = new FraudDetector(List.of(
                new FraudRule1("rule 1"),
                new FraudRule2("rule 2"),
                new FraudRule3("rule 3"),
                new FraudRule4("rule 4"),
                new FraudRule5("rule 5")
        ));
        FraudDetectionResult result = fd.isFraud(tr1);

        Transaction tr2 = new Transaction(new Trader("pokemon1", "Sydney", "UK"), 500);
        FraudDetectionResult result2 = fd.isFraud(tr2);
    }
}