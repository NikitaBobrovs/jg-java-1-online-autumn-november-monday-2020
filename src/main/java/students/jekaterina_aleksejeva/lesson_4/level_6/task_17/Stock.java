package students.jekaterina_aleksejeva.lesson_4.level_6.task_17;

class Stock {
    String companyName;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String companyName, int nominalValue) {
        this.companyName = companyName;
        this.currentPrice = nominalValue;
        this.minPrice = nominalValue;
        this.maxPrice = nominalValue;
    }
     void updatePrice(int updatedPrice){
        this.currentPrice = updatedPrice;

        if (minPrice >= updatedPrice) {
            minPrice = updatedPrice;
        }
         if (maxPrice <= updatedPrice) {
             maxPrice = updatedPrice;
         }
     }
     String getPriceInformation(){
        return "Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}

class StockDemo{
    public static void main(String[] args) {
        Stock abc = new Stock("ABC Corp.", 100);
        System.out.println(abc.getPriceInformation());

        abc.updatePrice(150);
        abc.updatePrice(70);
        abc.updatePrice(140);
        System.out.println(abc.getPriceInformation());
    }
}

class StockTest{
    public static void main(String[] args) {
        testUpdateCompletion();
        testPriceInformation();
    }
    static void testUpdateCompletion(){
        System.out.println("Test if update of current, max & min price values is complete in result of input of 3 new prices");
        String current = " = Current Price for the referenced period updated: 110";
        String max = " = Max Price for the referenced period updated: 199";
        String min = " = Min Price for the referenced period updated: 99";
        int expectedCurrentPrice = 110;
        int expectedMinPrice = 99;
        int expectedMaxPrice = 199;

        Stock test = new Stock("ABC Corp.", 100);
        test.updatePrice(199);
        test.updatePrice(99);
        test.updatePrice(110);


        if (expectedCurrentPrice == test.currentPrice) {System.out.println("PASS " + test.currentPrice + current);}
        else {System.out.println("FAIL " + test.currentPrice + current);}
        if (expectedMaxPrice == test.maxPrice){System.out.println("PASS " + test.maxPrice + max);}
        else {System.out.println("FAIL "+ test.maxPrice + max);}
        if (expectedMinPrice == test.minPrice){System.out.println("PASS " + test.minPrice + min);}
        else {System.out.println("FAIL "+ test.minPrice + min);}
        }

        static void testPriceInformation(){
            System.out.println("Test if Price Information is adjusted in accordance with Data Update");
            Stock test = new Stock("XYZ INC.", 90);
            String expectedCompanyName = "XYZ INC.";
            int expectedCurrentPrice = 95;
            int expectedMinPrice = 90;
            int expectedMaxPrice = 95;
            test.updatePrice(95);
            String actualPriceInformation = test.getPriceInformation();
            String expectedPriceInformation = "Company = " + expectedCompanyName + ", Current Price = " + expectedCurrentPrice + ", Min Price = " + expectedMinPrice + ", Max Price = " + expectedMaxPrice;
            if (expectedPriceInformation.equals(actualPriceInformation)) {System.out.println("PASS " + actualPriceInformation);}
            else {System.out.println("FAIL " + expectedPriceInformation);}
        }
}




