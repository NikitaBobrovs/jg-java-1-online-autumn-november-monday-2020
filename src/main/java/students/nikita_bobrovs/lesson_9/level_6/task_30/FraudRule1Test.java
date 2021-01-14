package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule1Test {
    public static void main(String[] args) {
        FraudRule1Test test = new FraudRule1Test();
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
        System.out.println("Test fraud rule 1 (yes)(name) : " + testResult(tester
                (true, new FraudRule1("rule1").isFraud(new Transaction
                        (new Trader("Pokemon", "Riga", "LV"), 50)))));
    }

    void ruleTest2() {
        System.out.println("Test fraud rule 1 (no)(name) : " + testResult(tester
                (false, new FraudRule1("rule1").isFraud(new Transaction
                        (new Trader("Poke", "Paris", "France"), 50)))));
    }
}
