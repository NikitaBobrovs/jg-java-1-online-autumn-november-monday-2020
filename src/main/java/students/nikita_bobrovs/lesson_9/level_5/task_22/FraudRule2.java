package students.nikita_bobrovs.lesson_9.level_5.task_22;

public class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sidney");
    }
}
