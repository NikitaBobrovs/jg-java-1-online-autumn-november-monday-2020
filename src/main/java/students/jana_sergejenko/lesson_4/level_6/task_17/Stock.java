package students.jana_sergejenko.lesson_4.level_6.task_17;

class Stock {
    String stockName;
    int stockCurrentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice) {
        stockName = name;
        stockCurrentPrice = currentPrice;
    }

    String getPriceInformation() {
        if (minPrice == 0) {
            minPrice = stockCurrentPrice;
        }
        if (maxPrice == 0) {
            maxPrice = stockCurrentPrice;
        }
        return ("Company= " + stockName + " Current Price= " + stockCurrentPrice + " Min Price= " + minPrice + " Max Price= " + maxPrice);
    }

    int updatePrice(int newPrice) {
        stockCurrentPrice = newPrice;
        if (newPrice < minPrice)
            minPrice = newPrice;
        else if (newPrice > maxPrice)
            maxPrice = newPrice;
        return maxPrice;
    }

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
