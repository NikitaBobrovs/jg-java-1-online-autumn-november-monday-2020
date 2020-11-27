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
        int expectedResult = 999;
        Stock stock = new Stock("GOOG", 10);
        int realResult = stock.updatePrice(999);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    static void scenario2() {
        int expectedResult = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        int realResult = stock.updatePrice(1);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    static void scenario3() {
        int expectedResult = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        int realResult = stock.updatePrice(1000);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    static void scenario4() {
        int expectedResult = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int realResult = stock.updatePrice(8);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    static void scenario5() {
        int expectedResult = 27;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(9);
        int realResult = stock.updatePrice(27);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    //10 -> 12 -> 5 -> 7 -> 99 -> 77
    static void scenario6() {
        int expectedResult = 99;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        int realResult = stock.updatePrice(77);
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
}
