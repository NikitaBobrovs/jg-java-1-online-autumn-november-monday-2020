package students.nikita_bobrovs.lesson_9.level_6.task_30;

class FraudRule5Test {
    public static void main(String[] args) {
        FraudRule5Test test = new FraudRule5Test();
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
        System.out.println("Test fraud rule 5 (yes)(Germany + amount) : " + testResult(tester
                (true, new FraudRule5("rule5").isFraud(new Transaction
                        (new Trader("Poke", "Riga", "Germany"), 1001)))));
    }

    void ruleTest2() {
        System.out.println("Test fraud rule 5 (no)(Germany + amount) : " + testResult(tester
                (false, new FraudRule5("rule5").isFraud(new Transaction
                        (new Trader("Poke", "Riga", "Germany"), 999)))));
    }
}
