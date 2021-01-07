package students.jana_sergejenko.lesson_9.level_5.task_22;

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
        FraudRule fraudrule=new FraudRule1("Rule 1");
        Transaction test = new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=true;
       System.out.println(fraudrule.getruleName() +" Fullname Fraud Result" + checkResult(result, expected));
    }
    public void scenario2() {
        FraudRule fraudrule=new FraudRule1("Rule 1");
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=false;
        System.out.println(fraudrule.getruleName()+" Fullname not Fraud Result" + checkResult(result, expected));
    }
    public void scenario3() {
        FraudRule fraudrule=new FraudRule2("Rule 2");
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 1000000000);
        boolean result = fraudrule.isFraud(test);
        boolean expected=true;
        System.out.println(fraudrule.getruleName() +" Fraud Amount Result" + checkResult(result, expected));
    }
    public void scenario4() {
        FraudRule fraudrule=new FraudRule2("Rule 2");
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=false;
        System.out.println(fraudrule.getruleName() +" NOT Fraud Amount Result" + checkResult(result, expected));
    }
    public void scenario5() {
        FraudRule fraudrule=new FraudRule3("Rule 3");
        Transaction test = new Transaction(new Trader("Napoleon", "Riga","Latvia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=false;
        System.out.println(fraudrule.getruleName() +" NOT Fraud City Result" + checkResult(result, expected));
    }
    public void scenario6() {
        FraudRule fraudrule=new FraudRule3("Rule 3");
        Transaction test = new Transaction(new Trader("Napoleon", "Sidney","Australia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=true;
        System.out.println(fraudrule.getruleName()+ " Fraud City Result" + checkResult(result, expected));
    }
    public void scenario7() {
        FraudRule fraudrule=new FraudRule4("Rule 4");
        Transaction test = new Transaction(new Trader("Napoleon", "Jamaica","Latvia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=false;
        System.out.println(fraudrule.getruleName()+" Fraud City 2 Result" + checkResult(result, expected));
    }
    public void scenario8() {
        FraudRule fraudrule=new FraudRule4("Rule 4");
        Transaction test = new Transaction(new Trader("Napoleon", "Sidney","Latvia"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=false;
        System.out.println(fraudrule.getruleName()+" Fraud City 2 Result" + checkResult(result, expected));
    }
    public void scenario9() {
        FraudRule fraudrule=new FraudRule5("Rule 5");
        Transaction test = new Transaction(new Trader("Napoleon", "Berlin","Germany"), 101);
        boolean result = fraudrule.isFraud(test);
        boolean expected=true;
        System.out.println(fraudrule.getruleName() +" Fraud Country Result" + checkResult(result, expected));
    }
    public void scenario10() {
        FraudRule fraudrule=new FraudRule5("Rule 5");
        Transaction test = new Transaction(new Trader("Napoleon", "Berlin","Germany"), 100);
        boolean result = fraudrule.isFraud(test);
        boolean expected=false;
        System.out.println(fraudrule.getruleName()+ " NOT Fraud Country Result" + checkResult(result, expected));
    }

}
