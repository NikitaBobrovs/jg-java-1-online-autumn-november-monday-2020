package students.jelena_kaverska.lesson_9.level_5_6;

abstract class FraudRule {
    private String ruleName;

    FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    //реализуйте get() метод для свойства ruleName
    public String getRuleName() {
        return ruleName;
    }

    abstract boolean isFraud(Transaction t);
}