package students.viktors_cesnokovs.lesson_9.level_6.task_30;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) { super(ruleName); }

    public boolean isFraud(Transaction t) { return t.getAmount() > 1000000; }
}
