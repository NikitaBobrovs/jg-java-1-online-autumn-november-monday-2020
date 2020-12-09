package students.jana_sergejenko.lesson_4.level_6.task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        StockTest.scenario1();
        StockTest.scenario2();
        StockTest.scenario3();
        StockTest.scenario4();
        StockTest.scenario5();
        StockTest.scenario6();
    }

    static void scenario1() {
        int expectedCurrentPrice = 999;
        int expectedMinPrice = 10;
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);

        if (stock.currentPrice == expectedCurrentPrice) {
            System.out.println("OK 1");
        } else
            System.out.println("NOT OK 1");

        if (stock.minPrice == expectedMinPrice) {
            System.out.println("OK 1");
        } else {
            System.out.println("NOT OK 1");
        }

        if (stock.maxPrice == expectedMaxPrice) {
            System.out.println("OK 1");
        } else {
            System.out.println("NOT OK 1");
        }
    }

    static void scenario2() {
        int expectedCurrentPrice = 999;
        int expectedMinPrice = 10;
        int expectedMaxPrice = 999;

        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        if (stock.currentPrice == expectedCurrentPrice) {
            System.out.println("OK 2");
        } else
            System.out.println("NOT OK 2");

        if (stock.minPrice == expectedMinPrice) {
            System.out.println("OK 2");
        } else {
            System.out.println("NOT OK 2");
        }

        if (stock.maxPrice == expectedMaxPrice) {
            System.out.println("OK 2");
        } else {
            System.out.println("NOT OK 2");
        }
    }


    static void scenario3() {
        int expectedCurrentPrice = 2;
        int expectedMinPrice = 2;
        int expectedMaxPrice = 999;

        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        if (stock.currentPrice == expectedCurrentPrice) {
            System.out.println("OK 3");
        } else
            System.out.println("NOT OK 3");

        if (stock.minPrice == expectedMinPrice) {
            System.out.println("OK 3");
        } else {
            System.out.println("NOT OK 3");
        }

        if (stock.maxPrice == expectedMaxPrice) {
            System.out.println("OK 3");
        } else {
            System.out.println("NOT OK 3");
        }
    }

    static void scenario4() {
        int expectedCurrentPrice = 1000;
        int expectedMinPrice = 2;
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        if (stock.currentPrice == expectedCurrentPrice) {
            System.out.println("OK 4");
        } else
            System.out.println("NOT OK 4");

        if (stock.minPrice == expectedMinPrice) {
            System.out.println("OK 4");
        } else {
            System.out.println("NOT OK 4");
        }

        if (stock.maxPrice == expectedMaxPrice) {
            System.out.println("OK 4");
        } else {
            System.out.println("NOT OK 4");
        }
    }

    static void scenario5() {
        int expectedCurrentPrice = 9;
        int expectedMinPrice = 9;
        int expectedMaxPrice = 10;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(9);
        if (stock.currentPrice == expectedCurrentPrice) {
            System.out.println("OK 5");
        } else
            System.out.println("NOT OK 5");

        if (stock.minPrice == expectedMinPrice) {
            System.out.println("OK 5");
        } else {
            System.out.println("NOT OK 5");
        }

        if (stock.maxPrice == expectedMaxPrice) {
            System.out.println("OK 5");
        } else {
            System.out.println("NOT OK 5");
        }
    }


    //10 -> 12 -> 5 -> 7 -> 99 -> 77
    static void scenario6() {
        int expectedCurrentPrice = 99;
        int expectedMinPrice = 5;
        int expectedMaxPrice = 99;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        if (stock.currentPrice == expectedCurrentPrice) {
            System.out.println("OK 6");
        } else
            System.out.println("NOT OK 6");

        if (stock.minPrice == expectedMinPrice) {
            System.out.println("OK 6");
        } else {
            System.out.println("NOT OK 6");
        }

        if (stock.maxPrice == expectedMaxPrice) {
            System.out.println("OK 6");
        } else {
            System.out.println("NOT OK 6");
        }

    }
}
