package students.jelena_kaverska.lesson_4.level_6.task_17;

class Stock {
    String company;
    int currentPrice;
    int minPrice;
    int maxPrice;

    public Stock(String company, int initialPrice) {
        this.company = company;
        this.currentPrice = initialPrice;
        minPrice = initialPrice;
        maxPrice = initialPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void updatePrice(int update) {
        if (minPrice > update) {
            minPrice = update;
        }
        currentPrice = update;
        if (maxPrice < update) {
            maxPrice = update;
        }
    }

    public String getPriceInformation() {
        return "Company = " + company + ", Current price = " + currentPrice + ", Min price = " + minPrice
                + ", Max price = " + maxPrice;
    }
}

class MyStockDemo {

    public static void main(String[] args) {
        Stock aapl = new Stock("AAPL", 10);
        System.out.println(aapl.getPriceInformation());

        aapl.updatePrice(15);
        aapl.updatePrice(7);
        aapl.updatePrice(14);
        System.out.println(aapl.getPriceInformation());
    }
}

class StockTest {

    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
    }

    static void test1() {
        System.out.println("Testing price/min/max update with the new price greater initial price");
        String priceUpdated = "Update current price: 10 -> 12";
        String minUpdated = "Update min price: 10 -> 10";
        String maxUpdated = "Update max price: 10 -> 12";
        int initialPrice = 10;
        int priceUpdate = 12;
        int expectedCurrent = 12;
        int expectedMax = 12;
        int expectedMin = 10;

        Stock myStock = new Stock("aapl", initialPrice);
        myStock.updatePrice(priceUpdate);

        if (myStock.getCurrentPrice() == expectedCurrent) {
            System.out.println("PASSED: " + priceUpdated);
        } else {
            System.out.println("FAILED: " + priceUpdated);
        }
        if (myStock.getMinPrice() == expectedMin) {
            System.out.println("PASSED: " + minUpdated);
        } else {
            System.out.println("FAILED: " + minUpdated);
        }
        if (myStock.getMaxPrice() == expectedMax) {
            System.out.println("PASSED: " + maxUpdated);
        } else {
            System.out.println("FAILED: " + maxUpdated);
        }
    }

    static void test2() {
        System.out.println("Testing price/min/max update with the new price lesser than initial price");
        String priceUpdated = "Update current price: 10 -> 5";
        String minUpdated = "Update min price: 10 -> 5";
        String maxUpdated = "Update max price: 10 -> 10";
        int initialPrice = 10;
        int priceUpdate = 5;
        int expectedCurrent = 5;
        int expectedMax = 10;
        int expectedMin = 5;

        Stock myStock = new Stock("aapl", initialPrice);
        myStock.updatePrice(priceUpdate);

        if (myStock.getCurrentPrice() == expectedCurrent) {
            System.out.println("PASSED: " + priceUpdated);
        } else {
            System.out.println("FAILED: " + priceUpdated);
        }
        if (myStock.getMinPrice() == expectedMin) {
            System.out.println("PASSED: " + minUpdated);
        } else {
            System.out.println("FAILED: " + minUpdated);
        }
        if (myStock.getMaxPrice() == expectedMax) {
            System.out.println("PASSED: " + maxUpdated);
        } else {
            System.out.println("FAILED: " + maxUpdated);
        }
    }
}