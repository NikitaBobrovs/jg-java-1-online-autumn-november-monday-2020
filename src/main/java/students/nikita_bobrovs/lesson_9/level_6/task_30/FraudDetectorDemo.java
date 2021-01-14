package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudDetectorDemo {
    public static void main(String[] args) {

        FraudRule[] fraudRules = {
                new FraudRule1("rule1"),
                new FraudRule2("rule2"),
                new FraudRule3("rule3"),
                new FraudRule4("rule4"),
                new FraudRule5("rule5")
        };

        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        Trader trader = new Trader("Name", "City", "Country");
        Transaction transaction = new Transaction(trader, 50);
        System.out.println("No fraud ");
        System.out.println(fraudDetector.isFraud(transaction));
        System.out.println("============");

        Trader trader1 = new Trader("Name", "City", "Country");
        Transaction transaction1 = new Transaction(trader1, 5000000);
        System.out.println("Fraud");
        System.out.println(fraudDetector.isFraud(transaction1));

    }
}
