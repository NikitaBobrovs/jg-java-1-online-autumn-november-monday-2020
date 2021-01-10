package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudDetector {
    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println(fraudRule.getRuleName());
                System.out.println(t.getTrader().toString());
                System.out.println(t.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return null;
    }
}
