package students.jana_sergejenko.lesson_9.level_5.task_22;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public boolean isFraud(Transaction t) {
        return false;
    }
    // Getter
    public String getruleName() {
        return ruleName;
    }
}
