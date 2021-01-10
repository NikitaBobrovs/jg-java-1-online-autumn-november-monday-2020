package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule3Test {
    public static void main(String[] args) {
        FraudRule3Test test = new FraudRule3Test();
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
        System.out.println("Test fraud rule 3 (yes)(country) : " + testResult(tester
                (true, new FraudRule3("rule3").isFraud(new Transaction
                        (new Trader("Poke", "Riga", "Jamaica"), 50)))));
    }

    void ruleTest2() {
        System.out.println("Test fraud rule 3 (no)(county) : " + testResult(tester
                (false, new FraudRule3("rule3").isFraud(new Transaction
                        (new Trader("Poke", "Riga", "France"), 50)))));
    }
}
