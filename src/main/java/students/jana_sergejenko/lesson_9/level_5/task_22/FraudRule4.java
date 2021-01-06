package students.jana_sergejenko.lesson_9.level_5.task_22;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.gettrader().getcountry().equals("Jamaica");
    }

}