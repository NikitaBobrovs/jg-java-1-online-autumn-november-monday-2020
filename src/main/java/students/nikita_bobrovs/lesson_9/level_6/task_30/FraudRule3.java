package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule3 extends FraudRule {
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Jamaica");
    }
}
