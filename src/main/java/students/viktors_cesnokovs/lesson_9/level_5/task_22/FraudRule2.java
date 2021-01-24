package students.viktors_cesnokovs.lesson_9.level_5.task_22;

class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) { super(ruleName); }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sidney");
    }
}
