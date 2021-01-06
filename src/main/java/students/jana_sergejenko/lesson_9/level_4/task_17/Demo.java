package students.jana_sergejenko.lesson_9.level_4.task_17;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.scenario1();
        demo.scenario2();
        demo.scenario3();
        demo.scenario4();
        demo.scenario5();
        demo.scenario6();
        demo.scenario7();
        demo.scenario8();
        demo.scenario9();
        demo.scenario10();
    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        Transaction test = new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=true;
        System.out.println("Fullname Fraud Result" + checkResult(result, expected));
    }
    public void scenario2() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=false;
        System.out.println("Fullname not Fraud Result" + checkResult(result, expected));
    }
    public void scenario3() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 1000000000);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=true;
        System.out.println("Fraud Amount Result" + checkResult(result, expected));
    }
    public void scenario4() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=false;
        System.out.println("NOT Fraud Amount Result" + checkResult(result, expected));
    }
    public void scenario5() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=false;
        System.out.println("NOT Fraud City Result" + checkResult(result, expected));
    }
    public void scenario6() {
        Transaction test = new Transaction(new Trader("Napoleon", "Sidney","Australia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=true;
        System.out.println("Fraud City Result" + checkResult(result, expected));
    }
    public void scenario7() {
        Transaction test = new Transaction(new Trader("Napoleon", "Jamaica","Latvia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=true;
        System.out.println("Fraud City 2 Result" + checkResult(result, expected));
    }
    public void scenario8() {
        Transaction test = new Transaction(new Trader("Napoleon", "Sidney","Latvia"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=true;
        System.out.println("Fraud City 2 Result" + checkResult(result, expected));
    }
    public void scenario9() {
        Transaction test = new Transaction(new Trader("Napoleon", "Berlin","Germany"), 101);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=true;
        System.out.println("Fraud Country Result" + checkResult(result, expected));
    }
    public void scenario10() {
        Transaction test = new Transaction(new Trader("Napoleon", "Berlin","Germany"), 100);
        boolean result = (new FraudDetector().isFraud(test));
        boolean expected=false;
        System.out.println("NOT Fraud Country Result" + checkResult(result, expected));
    }

}
