package students.nikita_bobrovs.lesson_9.level_4.task_17;

class FraudDetector {
    boolean isFraud(Transaction t, IsFraudTrader trad, IsFraudTransaction tran) {
        return (trad.isFraudTrader(t) || tran.isFraudTransaction(t));
    }
}
