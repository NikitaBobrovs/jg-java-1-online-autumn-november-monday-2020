package students.nikita_bobrovs.lesson_9.level_4.task_17;

class IsFraudTrader extends FraudDetector {
    private boolean isFraudName(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");
    }

    private boolean isFraudCity(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sidney");
    }

    private boolean isFraudCountry(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Jamaica");
    }

    protected boolean isFraudTrader(Transaction t) {
        return (isFraudName(t) || isFraudCity(t) || isFraudCountry(t));
    }
}
