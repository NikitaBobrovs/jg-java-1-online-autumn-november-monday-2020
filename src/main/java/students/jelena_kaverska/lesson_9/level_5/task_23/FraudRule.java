package students.jelena_kaverska.lesson_9.level_5.task_23;

abstract class FraudRule {
    private String ruleName;

    FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    abstract boolean isFraud(Transaction t);
}