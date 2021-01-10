package students.jana_sergejenko.lesson_9.level_5.task_22;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getamount() > 1000000) ;
    }

}