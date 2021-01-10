package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");
    }
}
