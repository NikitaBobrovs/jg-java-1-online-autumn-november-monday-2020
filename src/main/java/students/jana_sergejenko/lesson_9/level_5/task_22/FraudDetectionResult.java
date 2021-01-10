package students.jana_sergejenko.lesson_9.level_5.task_22;

public class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;
    // реализуйте конструктор класса
    FraudDetectionResult(boolean fraud, String ruleName){
        this.fraud=fraud;
        this.ruleName=ruleName;
    }
    // реализуйте get() и set() методы для каждого совйства
    // Getter
    public String getruleName() {
        return ruleName;
    }

    // Setter
    public void setruleName(String newruleName) {
        this.ruleName = newruleName;
    }
    public boolean getfraud() {
        return fraud;
    }

    // Setter
    public void setfraud(boolean newfraud) {
        this.fraud = newfraud;
    }


}
