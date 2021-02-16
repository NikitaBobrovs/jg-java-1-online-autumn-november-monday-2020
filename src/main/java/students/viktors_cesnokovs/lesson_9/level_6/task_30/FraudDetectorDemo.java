package students.viktors_cesnokovs.lesson_9.level_6.task_30;

class FraudDetectorDemo {
    public static void main(String[] args) {

        FraudRule[] fraudRules = {
                new FraudRule1("Rule Nr.1"),
                new FraudRule2("Rule Nr.2"),
                new FraudRule3("Rule Nr.3"),
                new FraudRule4("Rule Nr.4"),
                new FraudRule5("Rule Nr.5")
        };

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Igor", "Sidney", "Russia");
        Transaction transaction = new Transaction(trader, 100000000);
        System.out.print(fraudDetector.isFraud(transaction));
    }
}
