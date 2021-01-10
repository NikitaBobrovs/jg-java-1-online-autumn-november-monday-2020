package students.nikita_bobrovs.lesson_9.level_4.task_17;

class IsFraudTransaction extends FraudDetector {
    private boolean isFraudAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    private boolean isFraudGerman(Transaction t) {
        if (t.getTrader().getCountry().equalsIgnoreCase("Germany")) {
            return t.getAmount() > 1000;
        }
        return false;
    }

    protected boolean isFraudTransaction(Transaction t) {
        return (isFraudAmount(t) || isFraudGerman(t));
    }
}
