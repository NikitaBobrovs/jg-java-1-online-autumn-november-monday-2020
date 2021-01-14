package students.jelena_kaverska.lesson_9.level_5_6;

class FraudRule4 extends FraudRule{

    FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Jamaica");
    }
}