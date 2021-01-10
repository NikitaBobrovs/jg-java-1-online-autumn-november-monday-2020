package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule4Test {
    public static void main(String[] args) {
        FraudRule4Test test = new FraudRule4Test();
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
        System.out.println("Test fraud rule 4 (yes)(amount) : " + testResult(tester
                (true, new FraudRule4("rule4").isFraud(new Transaction
                        (new Trader("Poke", "Riga", "Jama"), 1000001)))));
    }

    void ruleTest2() {
        System.out.println("Test fraud rule 4 (no)(amount) : " + testResult(tester
                (false, new FraudRule4("rule4").isFraud(new Transaction
                        (new Trader("Poke", "Riga", "France"), 50)))));
    }
}
