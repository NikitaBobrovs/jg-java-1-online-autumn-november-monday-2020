package students.viktors_cesnokovs.lesson_9.level_4.task_17;

class FraudDetector {
    boolean fraud(Transaction t) {
        return (isFraudTrader(t) || (isFraudCity(t)) || isFraudCountry(t) ||
                isFraudName(t) || isFraudAmount(t) || isFraudGerman(t));
    }

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

    private boolean isFraudAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    private boolean isFraudGerman(Transaction t) {
        if (t.getTrader().getCountry().equalsIgnoreCase("Germany")) {
            return t.getAmount() > 1000;
        }
        return false;
    }
}
