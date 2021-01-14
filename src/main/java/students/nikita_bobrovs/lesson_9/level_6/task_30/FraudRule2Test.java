package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule2Test {
    public static void main(String[] args) {
        FraudRule2Test test = new FraudRule2Test();
        test.ruleTest1();
        test.ruleTest2();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private boolean tester(boolean expected, boolean real) {
        return expected == real;
    }

    void ruleTest1() {
        Trader trader = new Trader("Pikachu", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 50);

        System.out.println("Test fraud rule 2 (yes)(city) : " + testResult(tester
                (true, new FraudRule2("rule2").isFraud(transaction))));
    }

    void ruleTest2() {
        Trader trader = new Trader("Pikachu", "Sid", "Australia");
        Transaction transaction = new Transaction(trader, 50);

        System.out.println("Test fraud rule 2 (yes)(city) : " + testResult(tester
                (false, new FraudRule2("rule2").isFraud(transaction))));
    }
}
