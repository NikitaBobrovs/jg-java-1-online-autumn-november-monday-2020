package students.jana_sergejenko.lesson_9.level_5.task_22;

public class FraudRuleTest {
    public static void main(String[] args) {
        FraudRuleTest demo = new FraudRuleTest();
        demo.scenario1();
        demo.scenario2();
        demo.scenario3();
        demo.scenario4();
        demo.scenario5();
        demo.scenario6();
        demo.scenario7();
        demo.scenario8();
        demo.scenario9();
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
        boolean result = (new FraudRule1("FraudRule1").isFraud(test));
        boolean expected = true;
        System.out.println("Rule1 Fraud Result" + checkResult(result, expected));
    }

    public void scenario2() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Latvia"), 99);
        boolean result = (new FraudRule2("FraudRule2").isFraud(test));
        boolean expected = false;
        System.out.println("Rule2 NOT Fraud Result" + checkResult(result, expected));
    }

    public void scenario3() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Latvia"), 11111199);
        boolean result = (new FraudRule2("FraudRule2").isFraud(test));
        boolean expected = true;
        System.out.println("Rule2 Fraud Result" + checkResult(result, expected));
    }
    public void scenario4() {
        Transaction test = new Transaction(new Trader("Napoleon", "Sidney", "Latvia"), 11111199);
        boolean result = (new FraudRule3("FraudRule3").isFraud(test));
        boolean expected = true;
        System.out.println("Rule3 Fraud Result" + checkResult(result, expected));
    }
    public void scenario5() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Latvia"), 11111199);
        boolean result = (new FraudRule3("FraudRule3").isFraud(test));
        boolean expected = false;
        System.out.println("Rule3 NOT Fraud Result" + checkResult(result, expected));
    }
    public void scenario6() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Jamaica"), 11111199);
        boolean result = (new FraudRule4("FraudRule4").isFraud(test));
        boolean expected = true;
        System.out.println("Rule4 Fraud Result" + checkResult(result, expected));
    }
    public void scenario7() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Latvia"), 11111199);
        boolean result = (new FraudRule4("FraudRule4").isFraud(test));
        boolean expected = false;
        System.out.println("Rule 4 NOT Fraud Result" + checkResult(result, expected));
    }
    public void scenario8() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Germany"), 1);
        boolean result = (new FraudRule5("FraudRule5").isFraud(test));
        boolean expected = false;
        System.out.println("Rule5 Fraud Result" + checkResult(result, expected));
    }
    public void scenario9() {
        Transaction test = new Transaction(new Trader("Napoleon", "Riga", "Germany"), 1000000000);
        boolean result = (new FraudRule5("FraudRule5").isFraud(test));
        boolean expected = true;
        System.out.println("Rule5 NOT Fraud Result" + checkResult(result, expected));
    }
}
