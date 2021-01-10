package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRule3Tests {
    FraudRule fraudRule = new FraudRule3("Rule 3");

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testPositive() {
        Transaction t = new Transaction(new Trader("aaa", "Sydney", "AU"), 100000);
        boolean exp = true;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    void testNegative() {
        Transaction t = new Transaction(new Trader("aaa", "Sidney", "AU"), 100000);
        boolean exp = false;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " negative test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        FraudRule3Tests tests = new FraudRule3Tests();
        tests.testPositive();
        tests.testNegative();
    }
}