package students.nikita_bobrovs.lesson_9.level_5.task_22;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");
    }
}
