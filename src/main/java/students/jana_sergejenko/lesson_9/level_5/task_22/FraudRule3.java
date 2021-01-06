package students.jana_sergejenko.lesson_9.level_5.task_22;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.gettrader().getcity().equals("Sidney");
    }

}