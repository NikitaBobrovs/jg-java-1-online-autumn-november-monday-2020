package students.jana_sergejenko.lesson_4.level_6.task_17;

class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        minPrice = this.currentPrice;
        maxPrice = this.currentPrice;
    }

    String getPriceInformation() {
        return ("Company= " + name + " Current Price= " + currentPrice + " Min Price= " + minPrice + " Max Price= " + maxPrice);
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice)
           minPrice = newPrice;
        else if (newPrice > maxPrice)
            maxPrice = newPrice;
    }

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        //System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
       // priceInformation = google.getPriceInformation();
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
