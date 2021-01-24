package students.viktors_cesnokovs.lesson_9.level_5.task_22;

class FraudDetector {
    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) { this.fraudRules = fraudRules; }

    boolean fraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
