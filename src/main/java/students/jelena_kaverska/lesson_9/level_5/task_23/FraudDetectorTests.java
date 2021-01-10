package students.jelena_kaverska.lesson_9.level_5.task_23;

import java.util.List;

class FraudDetectorTests {
    FraudDetector fd = new FraudDetector(List.of(
            new FraudRule1("rule 1"),
            new FraudRule2("rule 2"),
            new FraudRule3("rule 3"),
            new FraudRule4("rule 4"),
            new FraudRule5("rule 5")
    ));

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testRule1() {
        Transaction tr1 = new Transaction(new Trader("pokemon", "London", "UK"), 500);
        boolean exp = true;
        System.out.println("Rule 1 test: " + printResults(exp == fd.isFraud(tr1)));
    }

    void testRule2() {
        Transaction tr2 = new Transaction(new Trader("aaa", "London", "UK"), 1000001);
        boolean exp = true;
        System.out.println("Rule 2 test: " + printResults(exp == fd.isFraud(tr2)));
    }

    void testRule3() {
        Transaction tr3 = new Transaction(new Trader("aaa", "Sydney", "AU"), 200);
        boolean exp = true;
        System.out.println("Rule 3 test: " + printResults(exp == fd.isFraud(tr3)));
    }

    void testRule4() {
        Transaction tr4 = new Transaction(new Trader("aaa", "Kingston", "Jamaica"), 100000);
        boolean exp = true;
        System.out.println("Rule 4 test: " + printResults(exp == fd.isFraud(tr4)));
    }

    void testRule5() {
        Transaction tr5 = new Transaction(new Trader("aaa", "Berlin", "Germany"), 10001);
        boolean exp = true;
        System.out.println("Rule 5 test: " + printResults(exp == fd.isFraud(tr5)));
    }

    public static void main(String[] args) {
        FraudDetectorTests tests = new FraudDetectorTests();
        tests.testRule1();
        tests.testRule2();
        tests.testRule3();
        tests.testRule4();
        tests.testRule5();
    }
}