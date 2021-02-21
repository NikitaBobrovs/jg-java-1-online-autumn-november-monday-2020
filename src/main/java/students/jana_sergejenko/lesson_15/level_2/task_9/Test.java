package students.jana_sergejenko.lesson_15.level_2.task_9;

import students.jana_sergejenko.lesson_9.level_5.task_22.Trader;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
        test.scenario6();
        test.scenario7();
    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Kolobok", "Riga", "Latvia");
        boolean result = test.isFraudName(trader);
        boolean expected = false;
        System.out.println("1st" + checkResult(result, expected));
    }

    public void scenario2() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = test.isFraudName(trader);
        boolean expected = true;
        System.out.println("2nd" + checkResult(result, expected));
    }
    public void scenario3() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = test.isFraudCity(trader);
        boolean expected = false;
        System.out.println("city riga" + checkResult(result, expected));
    }
    public void scenario4() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Sidney", "Latvia");
        boolean result = test.isFraudCity(trader);
        boolean expected = true;
        System.out.println("city sidney" + checkResult(result, expected));
    }
    public void scenario5() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Kolobok", "Sidney", "Latvia");
        boolean result = test.isFraud(trader);
        boolean expected = true;
        System.out.println("is fraud" + checkResult(result, expected));
    }
    public void scenario6() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        boolean result = test.isFraud(trader);
        boolean expected = true;
        System.out.println("is fraud" + checkResult(result, expected));
    }
    public void scenario7() {
        FraudDetector test = new FraudDetector();
        Trader trader = new Trader("Kolobok", "Riga", "Latvia");
        boolean result = test.isFraud(trader);
        boolean expected = false;
        System.out.println("is fraud" + checkResult(result, expected));
    }

}
