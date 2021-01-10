package students.jana_sergejenko.lesson_9.level_5.task_22;

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.gettrader().getcountry().equals("Germany") && (t.getamount() > 100);
    }

}
