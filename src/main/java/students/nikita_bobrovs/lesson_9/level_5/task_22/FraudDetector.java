package students.nikita_bobrovs.lesson_9.level_5.task_22;

class FraudDetector {
    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
