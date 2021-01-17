package students.jekaterina_aleksejeva.lesson_9.level_4.task_17;

class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}


class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}

class FraudDetector {

    boolean isFraud(Transaction t) {
        return fraudName(t) || fraudAmount(t) || fraudCity(t) || fraudCountry(t) || fraudCountryAndAmount(t);
    }

    boolean fraudName(Transaction t) {
        return t.getTrader().getFullName().equalsIgnoreCase("Pokemon");
    }

    boolean fraudAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    boolean fraudCity(Transaction t) {
        return t.getTrader().getCity().equalsIgnoreCase("Sidney");
    }

    boolean fraudCountry(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Jamaica");
    }

    boolean fraudCountryAndAmount(Transaction t) {
        return t.getTrader().getCountry().equalsIgnoreCase("Germany") && t.getAmount() > 1000;
    }

}

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.noTargetNameViaIsFraud();
        test.targetNameViaIsFraud();
        test.noTargetNameViaFraudName();
        test.targetNameViaFraudName();
        test.mioNonTargetAmountViaIsFraud();
        test.lessMioNonTargetAmountViaIsFraud();
        test.mioNonTargetAmountViaFraudAmount();
        test.lessMioNonTargetAmountViaFraudAmount();
        test.aboveMioTargetAmountViaIsFraud();
        test.aboveMioTargetAmountViaFraudAmount();
        test.noTargetCityViaIsFraud();
        test.targetCityViaIsFraud();
        test.noTargetCityViaFraudCity();
        test.targetCityViaFraudCity();
        test.noTargetCountryViaIsFraud();
        test.targetCountryViaIsFraud();
        test.noTargetCountryViaFraudCountry();
        test.targetCountryViaFraudCountry();
        test.multiTargetNameCityCountryAmountViaIsFraud();
        test.noTargetCountryAndAmountViaIsFraud();
        test.noTargetCountryAndAmountViaFraudCountryAndAmount();
        test.targetCountryAndAmountViaIsFraud();
        test.targetCountryAndAmountViaFraudCountryAndAmount();
        test.totalFraudNameCityAndCountryAndAmountViaIsFraud();

    }

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return expectedResult == actualResult;
    }

    FraudDetector fd = new FraudDetector();

    void noTargetNameViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Bond", "Pokemon", "UK"), 500000);
        Transaction trs1 = new Transaction(new Trader("James", "Sky-fall", "Pokemon"), 8);
        if (checkBooleanTest(false, fd.isFraud(trs)) && checkBooleanTest(false, fd.isFraud(trs1))) {
            System.out.println("No target name detected via general function IsFraud = PASS");
        } else System.out.println("No target name detected via general function IsFraud = FAILED");
    }

    void targetNameViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Pokemon", "New York", "USA"), 4000);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Target name detected via general function IsFraud = PASS");
        } else System.out.println("Target name detected via general function IsFraud = FAILED");
    }

    void noTargetNameViaFraudName() {
        Transaction trs = new Transaction(new Trader("Pokemoon", "Barcelona", "Pokemon"), 13);
        Transaction trs1 = new Transaction(new Trader("Spiderman", "Pokemon", "Canada"), 14);
        if (checkBooleanTest(false, fd.fraudName(trs)) && checkBooleanTest(false, fd.fraudName(trs1))) {
            System.out.println("No target name detected via special function fraudName = PASS");
        } else System.out.println("No target name detected via special function fraudName = FAILED");

    }

    void targetNameViaFraudName() {
        Transaction trs = new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 1);
        if (checkBooleanTest(true, fd.fraudName(trs))) {
            System.out.println("Target name detected via special function fraudName = PASS");
        } else System.out.println("Target name detected via special function fraudName = FAILED");
    }

    void mioNonTargetAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Leo", "Rome", "Italy"), 1000000);
        if (checkBooleanTest(false, fd.isFraud(trs))) {
            System.out.println("1000000 is not target amount as per general function IsFraud check = PASS");
        } else System.out.println("1000000 is not target amount as per general function IsFraud check = FAILED");
    }

    void lessMioNonTargetAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Leo", "Rome", "Italy"), 999999);
        if (checkBooleanTest(false, fd.isFraud(trs))) {
            System.out.println("999999 is not target amount as per general function IsFraud check = PASS");
        } else System.out.println("999999 is not target amount as per general function IsFraud check = FAILED");
    }

    void mioNonTargetAmountViaFraudAmount() {
        Transaction trs = new Transaction(new Trader("Caesar", "Milan", "Italy"), 1000000);
        if (checkBooleanTest(false, fd.fraudAmount(trs))) {
            System.out.println("1000000 is not target amount as per special function fraudAmount check = PASS");
        } else System.out.println("1000000 is not target amount as per special function fraudAmount check = FAILED");
    }

    void lessMioNonTargetAmountViaFraudAmount() {
        Transaction trs = new Transaction(new Trader("Robert", "Paris", "France"), 999999);
        if (checkBooleanTest(false, fd.fraudAmount(trs))) {
            System.out.println("999999 is not target amount as per special function fraudAmount check = PASS");
        } else System.out.println("999999 is not target amount as per special function fraudAmount check = FAILED");
    }

    void aboveMioTargetAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Thomas", "Tallin", "Estonia"), 1000001);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("1000001 is target amount as per general function IsFraud check = PASS");
        } else System.out.println("1000001 is target amount as per general function IsFraud check = FAILED");
    }

    void aboveMioTargetAmountViaFraudAmount() {
        Transaction trs = new Transaction(new Trader("Paulo", "Rio", "Brazil"), 10000002);
        if (checkBooleanTest(true, fd.fraudAmount(trs))) {
            System.out.println("1000002 is target amount as per special function fraudAmount check = PASS");
        } else System.out.println("1000002 is target amount as per special function fraudAmount check = FAILED");
    }

    void noTargetCityViaIsFraud() {
        Transaction trs = new Transaction(new Trader("MrX", "Pasadena", "Sidney"), 5);
        Transaction trs1 = new Transaction(new Trader("Sidney", "Moscow", "Russia"), 3);
        if (checkBooleanTest(false, fd.isFraud(trs)) && checkBooleanTest(false, fd.isFraud(trs1))) {
            System.out.println("No target city detected via general function IsFraud = PASS");
        } else System.out.println("No target city detected via general function IsFraud = FAILED");

    }

    void targetCityViaIsFraud() {
        Transaction trs = new Transaction(new Trader("MrY", "Sidney", "Australia"), 25);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Target city detected via general function IsFraud = PASS");
        } else System.out.println("Target city detected via general function IsFraud = FAILED");

    }

    void noTargetCityViaFraudCity() {
        Transaction trs = new Transaction(new Trader("MrY", "Australia", "Sidney"), 180);
        Transaction trs1 = new Transaction(new Trader("Sidney", "Brisbane", "New Zealand"), 200);
        if (checkBooleanTest(false, fd.fraudCity(trs)) && checkBooleanTest(false, fd.fraudCity(trs1))) {
            System.out.println("No target city detected via special function fraudCity = PASS");
        } else System.out.println("No target city detected via special function fraudCity = FAILED");

    }

    void targetCityViaFraudCity() {
        Transaction trs = new Transaction(new Trader("MrsA", "Sidney", "Australia"), 999);
        if (checkBooleanTest(true, fd.fraudCity(trs))) {
            System.out.println("Target city detected via special function fraudCity = PASS");
        } else System.out.println("Target city detected via special function fraudCity = FAILED");
    }

    void noTargetCountryViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Bob", "Jamaica", "Austria"), 457);
        Transaction trs1 = new Transaction(new Trader("Jamaica", "Budapest", "Hungary"), 123);
        if (checkBooleanTest(false, fd.isFraud(trs)) && checkBooleanTest(false, fd.isFraud(trs1))) {
            System.out.println("No target country detected via general function IsFraud = PASS");
        } else System.out.println("No target country detected via general function IsFraud = FAILED");

    }

    void targetCountryViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Don Pedro", "Kingston", "Jamaica"), 2222);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Target country detected via general function IsFraud = PASS");
        } else System.out.println("Target country detected via general function IsFraud = FAILED");

    }

    void noTargetCountryViaFraudCountry() {
        Transaction trs = new Transaction(new Trader("Will", "Jamaica", "Caribbean"), 88888);
        Transaction trs1 = new Transaction(new Trader("Jamaica", "Lucea", "Hanover"), 203040);
        if (checkBooleanTest(false, fd.fraudCountry(trs)) && checkBooleanTest(false, fd.fraudCountry(trs1))) {
            System.out.println("No target country detected via special function fraudCountry = PASS");
        } else System.out.println("No target country detected via special function fraudCountry = FAILED");

    }

    void targetCountryViaFraudCountry() {
        Transaction trs = new Transaction(new Trader("Sancho", "Black River", "Jamaica"), 2222);
        if (checkBooleanTest(true, fd.fraudCountry(trs))) {
            System.out.println("Target country detected via special function fraudCountry = PASS");
        } else System.out.println("Target country detected via special function fraudCountry = FAILED");

    }

    void multiTargetNameCityCountryAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Pokemon", "Sidney", "Jamaica"), 1000009);
        Transaction trs1 = new Transaction(new Trader("Pokemon", "Sydney*", "Jamayca*"), 1000009);
        Transaction trs2 = new Transaction(new Trader("Pokeman*", "Sidney", "Jamaica"), 100000);
        Transaction trs3 = new Transaction(new Trader("Pokemoon*", "Sidney", "Jamaica"), 1000009);
        if (checkBooleanTest(true, fd.isFraud(trs)) && checkBooleanTest(true, fd.isFraud(trs1)) &&
                checkBooleanTest(true, fd.isFraud(trs2)) && checkBooleanTest(true, fd.isFraud(trs3))) {
            System.out.println("Multi target - name, city, country and amount detected via general function isFraud = PASS");
        } else
            System.out.println("Multi target - name, city, country and amount detected via general function isFrau = FAILED");
    }

    void noTargetCountryAndAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Helena", "Dresden", "Germany"), 85);
        Transaction trs1 = new Transaction(new Trader("Albert", "Berlin", "Germany"), 1000);
        Transaction trs2 = new Transaction(new Trader("Arno", "Hamburg", "German"), 1001);
        if (checkBooleanTest(false, fd.isFraud(trs)) && checkBooleanTest(false, fd.isFraud(trs1)) &&
                checkBooleanTest(false, fd.isFraud(trs2))) {
            System.out.println("No target combination of country & amount detected via general function IsFraud = PASS");
        } else
            System.out.println("No target combination of country & amount detected via general function IsFraud = FAILED");

    }

    void targetCountryAndAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Dexter", "Bremen", "Germany"), 1001);
        if (checkBooleanTest(true, fd.isFraud(trs))) {
            System.out.println("Target combination of country & amount detected via general function IsFraud = PASS");
        } else
            System.out.println("Target combination of country & amount detected via general function IsFraud = FAILED");

    }

    void targetCountryAndAmountViaFraudCountryAndAmount() {
        Transaction trs = new Transaction(new Trader("Ivona", "Dusseldorf", "Germany"), 8000);
        if (checkBooleanTest(true, fd.fraudCountryAndAmount(trs))) {
            System.out.println("Target combination of country & amount detected via special function fraudCountryAndAmount = PASS");
        } else
            System.out.println("Target combination of country & amount detected via special function fraudCountryAndAmount = FAILED");

    }

    void noTargetCountryAndAmountViaFraudCountryAndAmount() {
        Transaction trs = new Transaction(new Trader("Helena", "Dresden", "Germany"), 85);
        Transaction trs1 = new Transaction(new Trader("Albert", "Berlin", "Germany"), 1000);
        Transaction trs2 = new Transaction(new Trader("Arno", "Hamburg", "German"), 1001);
        if (checkBooleanTest(false, fd.fraudCountryAndAmount(trs)) && checkBooleanTest(false, fd.fraudCountryAndAmount(trs1)) &&
                checkBooleanTest(false, fd.fraudCountryAndAmount(trs2))) {
            System.out.println("No target combination of country & amount detected via general function IsFraud = PASS");
        } else
            System.out.println("No target combination of country & amount detected via general function IsFraud = FAILED");

    }

    void totalFraudNameCityAndCountryAndAmountViaIsFraud() {
        Transaction trs = new Transaction(new Trader("Pokemon", "Sidney", "Germany"), 1005);
        Transaction trs1 = new Transaction(new Trader("Pokemon", "Berlin", "Germany"), 5000);
        Transaction trs2 = new Transaction(new Trader("Gregory", "Sidney", "Germany"), 1200);
        if (checkBooleanTest(true, fd.isFraud(trs)) && checkBooleanTest(true, fd.isFraud(trs1)) &&
                checkBooleanTest(true, fd.isFraud(trs2))) {
            System.out.println("Total of targets: name, city and country & amount detected via general function isFraud = PASS");
        } else
            System.out.println("Total of targets: name, city and country & amount detected via general function isFraud = FAIL");
    }


}
