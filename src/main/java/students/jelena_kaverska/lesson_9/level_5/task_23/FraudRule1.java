package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRule1 extends FraudRule{

    FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");
    }
}