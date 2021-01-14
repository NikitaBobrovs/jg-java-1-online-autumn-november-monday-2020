package students.jelena_kaverska.lesson_9.level_5_6;

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
        String exp = "rule 1";
        System.out.println("Rule 1 test: " + printResults(exp.equalsIgnoreCase(fd.isFraud(tr1).getRuleName())));
    }

    void testRule2() {
        Transaction tr2 = new Transaction(new Trader("aaa", "London", "UK"), 1000001);
        String exp = "rule 2";
        System.out.println("Rule 2 test: " + printResults(exp.equalsIgnoreCase(fd.isFraud(tr2).getRuleName())));
    }

    void testRule3() {
        Transaction tr3 = new Transaction(new Trader("aaa", "Sydney", "AU"), 200);
        String exp = "rule 3";
        System.out.println("Rule 3 test: " + printResults(exp.equalsIgnoreCase(fd.isFraud(tr3).getRuleName())));
    }

    void testRule4() {
        Transaction tr4 = new Transaction(new Trader("aaa", "Kingston", "Jamaica"), 100000);
        String exp = "rule 4";
        System.out.println("Rule 4 test: " + printResults(exp.equalsIgnoreCase(fd.isFraud(tr4).getRuleName())));
    }

    void testRule5() {
        Transaction tr5 = new Transaction(new Trader("aaa", "Berlin", "Germany"), 10001);
        String exp = "rule 5";
        System.out.println("Rule 5 test: " + printResults(exp.equalsIgnoreCase(fd.isFraud(tr5).getRuleName())));
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