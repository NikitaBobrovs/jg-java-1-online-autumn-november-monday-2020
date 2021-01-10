package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRule3 extends FraudRule{

    FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sydney");
    }
}