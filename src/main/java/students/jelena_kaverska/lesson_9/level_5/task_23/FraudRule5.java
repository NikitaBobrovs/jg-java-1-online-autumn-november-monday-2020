package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRule5 extends FraudRule {

    FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Germany")
                && t.getAmount() > 1000;
    }
}