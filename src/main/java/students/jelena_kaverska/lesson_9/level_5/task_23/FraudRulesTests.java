package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRulesTests {
    FraudRule fraudRule;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testPositiveRule4() {
        fraudRule = new FraudRule4("Rule 4");
        Transaction t = new Transaction(new Trader("aaa", "Kingston", "Jamaica"), 100000);
        boolean exp = true;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    void testNegativeRule4() {
        fraudRule = new FraudRule4("Rule 4");
        Transaction t = new Transaction(new Trader("aaa", "Kingston", "Aruba"), 100000);
        boolean exp = false;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    void testPositiveRule5() {
        fraudRule = new FraudRule5("Rule 5");
        Transaction t = new Transaction(new Trader("aaa", "Berlin", "Germany"), 1001);
        boolean exp = true;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    void testNegativeRule5() {
        fraudRule = new FraudRule5("Rule 5");
        Transaction t = new Transaction(new Trader("aaa", "Nice", "France"), 1001);
        boolean exp = false;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        FraudRulesTests tests = new FraudRulesTests();
        tests.testPositiveRule4();
        tests.testNegativeRule4();
        tests.testPositiveRule5();
        tests.testNegativeRule5();
    }
}