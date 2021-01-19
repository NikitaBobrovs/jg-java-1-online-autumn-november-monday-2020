package students.jekaterina_aleksejeva.lesson_9.level_5.task_23;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");

    }

}

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;

    }

}

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sidney");

    }

}

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Jamaica");

    }

}

class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Germany") && t.getAmount() > 1000;

    }

}

class FraudRuleTest {
    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();
        test.rule1NoFraudNames();
        test.rule1FraudNameFound();
        test.rule2NoFraudAmount();
        test.rule2FraudAmountFound();
        test.rule3NoFraudCityFound();
        test.rule3FraudCityFound();
        test.rule4NoFraudCountryFound();
        test.rule4FraudCountryFound();
        test.rule5NoFraudCountryAndAmountFound();
        test.rule5FraudCountryAndAmountFound();

    }

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return expectedResult == actualResult;
    }

    void rule1NoFraudNames() {
        FraudRule fr = new FraudRule1("Rule 1");
        Transaction trs = new Transaction(new Trader("Pokemoon", "Barcelona", "Pokemon"), 13);
        Transaction trs1 = new Transaction(new Trader("Spiderman", "Pokemon", "Canada"), 14);
        if (checkBooleanTest(false, fr.isFraud(trs)) && checkBooleanTest(false, fr.isFraud(trs1))) {
            System.out.println("Rule 1 execution: no fraud names found = PASS");
        } else System.out.println("Rule 1 execution: no fraud names found = FAILED");

    }

    void rule1FraudNameFound() {
        FraudRule fr = new FraudRule1("Rule 1");
        Transaction trs = new Transaction(new Trader("Pokemon", "Madrid", "Spain"), 150);
        if (checkBooleanTest(true, fr.isFraud(trs))) {
            System.out.println("Rule 1 execution: fraud name found = PASS");
        } else System.out.println("Rule 1 execution: fraud name found = FAILED");
    }

    void rule2NoFraudAmount() {
        FraudRule fr = new FraudRule2("Rule 2");
        Transaction trs = new Transaction(new Trader("Caesar", "Milan", "Italy"), 1000000);
        if (checkBooleanTest(false, fr.isFraud(trs))) {
            System.out.println("Rule 2 execution: 1000000 is not fraud amount = PASS");
        } else System.out.println("Rule 2 execution: 1000000 is not fraud amount = FAILED");
    }

    void rule2FraudAmountFound() {
        FraudRule fr = new FraudRule2("Rule 2");
        Transaction trs = new Transaction(new Trader("Lucas", "Grenoble", "France"), 1000005);
        if (checkBooleanTest(true, fr.isFraud(trs))) {
            System.out.println("Rule 2 execution: 1000005 is fraud amount = PASS");
        } else System.out.println("Rule 2 execution: 1000005 is fraud amount = FAILED");
    }

    void rule3NoFraudCityFound() {
        FraudRule fr = new FraudRule3("Rule 3");
        Transaction trs = new Transaction(new Trader("MrX", "Pasadena", "Sidney"), 5);
        Transaction trs1 = new Transaction(new Trader("Sidney", "Moscow", "Russia"), 3);
        if (checkBooleanTest(false, fr.isFraud(trs)) && checkBooleanTest(false, fr.isFraud(trs1))) {
            System.out.println("Rule 3 execution: no fraud city found = PASS");
        } else System.out.println("Rule 3 execution: no fraud city found = FAILED");


    }

    void rule3FraudCityFound() {
        FraudRule fr = new FraudRule3("Rule 3");
        Transaction trs = new Transaction(new Trader("Alex", "Sidney", "Australia"), 2222);
        if (checkBooleanTest(true, fr.isFraud(trs))) {
            System.out.println("Rule 3 execution: fraud city found = PASS");
        } else System.out.println("Rule 3 execution: fraud city found = FAILED");
    }

    void rule4NoFraudCountryFound() {
        FraudRule fr = new FraudRule4("Rule 4");
        Transaction trs = new Transaction(new Trader("Jamaica", "Costa Brava", "Cuba"), 888);
        Transaction trs1 = new Transaction(new Trader("Pedro", "Jamaica", "Argentina"), 7850);
        if (checkBooleanTest(false, fr.isFraud(trs)) && checkBooleanTest(false, fr.isFraud(trs1))) {
            System.out.println("Rule 4 execution: no fraud country found = PASS");
        } else System.out.println("Rule 4 execution: no fraud country found = FAILED");
    }

    void rule4FraudCountryFound() {
        FraudRule fr = new FraudRule4("Rule 4");
        Transaction trs = new Transaction(new Trader("Jose", "Negro", "Jamaica"), 39112);
        if (checkBooleanTest(true, fr.isFraud(trs))) {
            System.out.println("Rule 4 execution: fraud country found = PASS");
        } else System.out.println("Rule 4 execution: fraud country found = FAILED");
    }

    void rule5NoFraudCountryAndAmountFound() {
        FraudRule fr = new FraudRule5("Rule 5");
        Transaction trs = new Transaction(new Trader("Helena", "Dresden", "Germany"), 85);
        Transaction trs1 = new Transaction(new Trader("Albert", "Berlin", "Germany"), 1000);
        Transaction trs2 = new Transaction(new Trader("Arno", "Hamburg", "German"), 1001);
        if (checkBooleanTest(false, fr.isFraud(trs)) && checkBooleanTest(false, fr.isFraud(trs1)) &&
                checkBooleanTest(false, fr.isFraud(trs2))) {
            System.out.println("Rule 5 execution: no combination of fraud country & fraud amount is found = PASS");
        } else
            System.out.println("Rule 5 execution: no combination of fraud country & fraud amount is found = FAILED");

    }

    void rule5FraudCountryAndAmountFound() {
        FraudRule fr = new FraudRule5("Rule 5");
        Transaction trs = new Transaction(new Trader("Peter", "Hamburg", "Germany"), 10008);
        if (checkBooleanTest(true, fr.isFraud(trs))) {
            System.out.println("Rule 5 execution: combination of fraud country & fraud amount is found = PASS");
        } else
            System.out.println("Rule 5 execution: combination of fraud country & fraud amount is found = FAILED");

    }


}

