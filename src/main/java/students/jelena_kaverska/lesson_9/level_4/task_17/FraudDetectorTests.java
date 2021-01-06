package students.jelena_kaverska.lesson_9.level_4.task_17;

class FraudDetectorTests {
    FraudDetector f = new FraudDetector();

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testRule1Positive() {
        Transaction t = new Transaction(new Trader("pokemon", "London", "UK"), 500);
        boolean act = f.isWrongTraderName(t);
        boolean exp = true;
        System.out.println("Rule 1 test: " + printResults(act == exp));
    }

    void testRule1Negative() {
        Transaction t = new Transaction(new Trader("pokemon1", "London", "UK"), 500);
        boolean act = f.isWrongTraderName(t);
        boolean exp = false;
        System.out.println("Rule 1.1 test: " + printResults(act == exp));
    }

    void testRule2() {
        Transaction t = new Transaction(new Trader("aaa", "London", "UK"), 1000001);
        boolean act = f.isWrongAmount(t);
        boolean exp = true;
        System.out.println("Rule 2 test: " + printResults(act == exp));
    }

    void testRule3() {
        Transaction t = new Transaction(new Trader("aaa", "Sydney", "AU"), 100000);
        boolean act = f.isWrongCity(t);
        boolean exp = true;
        System.out.println("Rule 3 test: " + printResults(act == exp));
    }

    void testRule4() {
        Transaction t = new Transaction(new Trader("aaa", "Kingston", "Jamaica"), 100000);
        boolean act = f.isWrongCountry(t);
        boolean exp = true;
        System.out.println("Rule 4 test: " + printResults(act == exp));
    }

    void testRule44() {
        Transaction t = new Transaction(new Trader("aaa", "Kingston", "Jamaica"), 100000);
        boolean act = f.isFraudCountry().test(t);
        boolean exp = true;
        System.out.println("Rule 4.1 test: " + printResults(act == exp));
    }

    void testRule5() {
        Transaction t = new Transaction(new Trader("aaa", "Kingston", "Germany"), 1001);
        boolean act = f.isWrongCountryAndWrongAmount(t);
        boolean exp = true;
        System.out.println("Rule 5 test: " + printResults(act == exp));
    }

    public static void main(String[] args) {
        FraudDetectorTests tests = new FraudDetectorTests();
        tests.testRule1Positive();
        tests.testRule1Negative();
        tests.testRule2();
        tests.testRule3();
        tests.testRule4();
        tests.testRule44();
        tests.testRule5();
    }
}