package students.jekaterina_aleksejeva.lesson_9.level_6.task_30;

class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public boolean getFraud() {
        return fraud;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    // реализуйте конструктор класса
    // реализуйте get() и set() методы для каждого совйства
}
