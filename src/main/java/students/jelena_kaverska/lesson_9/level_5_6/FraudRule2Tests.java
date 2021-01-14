package students.jelena_kaverska.lesson_9.level_5_6;

class FraudRule2Tests {
    FraudRule fraudRule = new FraudRule2("Rule 2");

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testPositive() {
        Transaction t = new Transaction(new Trader("aaa", "London", "UK"), 1000001);
        boolean exp = true;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " positive test: " + printResults(exp == act));
    }

    void testNegative() {
        Transaction t = new Transaction(new Trader("aaa", "London", "UK"), 1000000);
        boolean exp = false;
        boolean act = fraudRule.isFraud(t);
        System.out.println(fraudRule.getRuleName() + " negative test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        FraudRule2Tests tests = new FraudRule2Tests();
        tests.testPositive();
        tests.testNegative();
    }
}