package students.jelena_kaverska.lesson_9.level_5.task_23;

class FraudRule1Tests {
    FraudRule fraudRule = new FraudRule1("Rule 1");

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testPositive() {
        Transaction t = new Transaction(new Trader("pokemon", "London", "UK"), 500);
        boolean exp = true;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    void testNegative() {
        Transaction t = new Transaction(new Trader("pokemon1", "London", "UK"), 500);
        boolean exp = false;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " negative test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        FraudRule1Tests tests = new FraudRule1Tests();
        tests.testPositive();
        tests.testNegative();
    }
}