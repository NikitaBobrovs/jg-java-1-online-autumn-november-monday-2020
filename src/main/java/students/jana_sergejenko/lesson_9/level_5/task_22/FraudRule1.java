package students.jana_sergejenko.lesson_9.level_5.task_22;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        // Перенесите сюда код реализации первого правила из класса FraudDetector
        return t.gettrader().getfullName().contains("Pokemon");
    }

}
