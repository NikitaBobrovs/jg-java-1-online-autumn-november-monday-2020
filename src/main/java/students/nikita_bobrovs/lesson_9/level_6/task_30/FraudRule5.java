package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        if (t.getTrader().getCountry().equalsIgnoreCase("Germany")) {
            return t.getAmount() > 1000;
        }
        return false;
    }
}
