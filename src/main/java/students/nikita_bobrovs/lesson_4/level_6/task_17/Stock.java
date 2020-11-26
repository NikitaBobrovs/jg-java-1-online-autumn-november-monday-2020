package students.nikita_bobrovs.lesson_4.level_6.task_17;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void updatePrice(int newPrice){
        this.currentPrice = newPrice;

        if (this.minPrice >= newPrice)
            this.minPrice = newPrice;

        if (this.maxPrice<=newPrice)
            this.maxPrice = newPrice;
    }

    String getPriceInformation() {
        return "Company = " + companyName + ", Current price = " + currentPrice +
                ", Min price = " + minPrice + ", Max price = "+maxPrice;
    }
}

class StockDemo{
    public static void main(String[] args) {
        Stock stock = new Stock("CCL",40);
        System.out.println(stock.getPriceInformation());
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        System.out.println(stock.getPriceInformation());
        System.out.println();
    }
}

class StockTest{
    public static void main(String[] args) {
        getPriceInformationTest();
        updatePriceTest1();
        updatePriceTest2();
    }
    static void getPriceInformationTest(){
        System.out.println("Get price info test (print set info)");
        String expectedCompanyName = "AAL";
        int expectedCurrentPrice = 5;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 5;
        String expectedResult = "Company = " + expectedCompanyName + ", Current price = " + expectedCurrentPrice +
                ", Min price = " + expectedMinPrice + ", Max price = "+expectedMaxPrice;

        Stock subject = new Stock("AAL",5);
        String realResult = subject.getPriceInformation();

        if (expectedResult.equals(realResult)){
            System.out.println("(OK)");
        } else
            System.out.println("(FAIL)");
    }


    static void updatePriceTest1(){
        System.out.println("Price update test. Different numbers. Over set(1.current,2.min,3.max)");
        int expectedCurrentPrice = 12;
        int expectedMinPrice = 3;
        int expectedMaxPrice = 12;

        Stock subject = new Stock("COTY",3);
        subject.updatePrice(5);
        subject.updatePrice(7);
        subject.updatePrice(12);

        if (expectedCurrentPrice == subject.currentPrice){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
        if (expectedMinPrice == subject.minPrice) {
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
        if (expectedMaxPrice == subject.maxPrice){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
    static void updatePriceTest2(){
        System.out.println("Price update test. Same numbers. Under set(1.current,2.min,3.max)");
        int expectedCurrentPrice = 1;
        int expectedMinPrice = 1;
        int expectedMaxPrice = 6;

        Stock subject = new Stock("COTY",6);
        subject.updatePrice(1);
        subject.updatePrice(1);
        subject.updatePrice(1);

        if (expectedCurrentPrice == subject.currentPrice){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
        if (expectedMinPrice == subject.minPrice) {
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
        if (expectedMaxPrice == subject.maxPrice){
            System.out.println("(OK)");
        } else {
            System.out.println("(FAIL)");
        }
    }
}
