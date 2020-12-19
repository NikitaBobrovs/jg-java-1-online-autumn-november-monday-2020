package students.viktors_cesnokovs.lesson_4.level_6.task_17;

public class Stock {
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
        Stock google = new Stock("GOOG", 10);
        System.out.println(google.getPriceInformation());
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        System.out.println(google.getPriceInformation());
    }
}

class StockTest {
    public static void main(String[] args) {
        test1();
        test2();
        System.out.println();
    }
    static void test1() {
        System.out.println("Test (price/min/max) update. Updated price higher than initial price");
        String priceUpdated = "Update current price: 20 -> 200";
        String minUpdated = "Update min price: 20 -> 20";
        String maxUpdated = "Update max price: 20 -> 200";
        int initialPrice = 20;
        int priceUpdate = 200;
        int expectedCurrent = 200;
        int expectedMax = 200;
        int expectedMin = 20;

        Stock google = new Stock("GOOG", initialPrice);
        google.updatePrice(priceUpdate);

        if (google.getCurrentPrice() == expectedCurrent) {
            System.out.println("PASSED: " + priceUpdated);
        } else {
            System.out.println("FAILED: " + priceUpdated);
        }
        if (google.getMinPrice() == expectedMin) {
            System.out.println("PASSED: " + minUpdated);
        } else {
            System.out.println("FAILED: " + minUpdated);
        }
        if (google.getMaxPrice() == expectedMax) {
            System.out.println("PASSED: " + maxUpdated);
        } else {
            System.out.println("FAILED: " + maxUpdated);
        }
    }

    static void test2() {
        System.out.println("Test (price/min/max) update. Updated price lower than initial price.");
        String priceUpdated = "Update current price: 300 -> 30";
        String minUpdated = "Update min price: 300 -> 30";
        String maxUpdated = "Update max price: 300 -> 300";
        int initialPrice = 300;
        int priceUpdate = 30;
        int expectedCurrent = 30;
        int expectedMax = 300;
        int expectedMin = 30;

        Stock google = new Stock ("GOOG", initialPrice);
        google.updatePrice(priceUpdate);

        if (google.getCurrentPrice() == expectedCurrent) {
            System.out.println("PASSED: " + priceUpdated);
        } else {
            System.out.println("FAILED: " + priceUpdated);
        }
        if (google.getMinPrice() == expectedMin) {
            System.out.println("PASSED: " + minUpdated);
        } else {
            System.out.println("FAILED: " + minUpdated);
        }
        if (google.getMaxPrice() == expectedMax) {
            System.out.println("PASSED: " + maxUpdated);
        } else {
            System.out.println("FAILED: " + maxUpdated);
        }
    }
}
