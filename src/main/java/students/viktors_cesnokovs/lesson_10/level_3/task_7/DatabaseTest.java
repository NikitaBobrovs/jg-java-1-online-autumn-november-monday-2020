package students.viktors_cesnokovs.lesson_10.level_3.task_7;

import java.util.Arrays;
import java.util.Optional;

class DatabaseTest {
    public static void main(String[] args) {
        DatabaseTest test = new DatabaseTest();
        test.saveTest();
        test.findTest1();
        test.findTest2();
    }

    private final InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
    private final Product prod1 = new Product("Car");
    private final Product prod2 = new Product("Milk");
    private final Product prod3 = new Product("Ticket");

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    private boolean tester(Product[] expected, Product[] real) {
        return Arrays.equals(expected, real);
    }

    void saveTest() {
        Product[] expected = {prod1, prod2, prod3};

        inMemoryDatabase.save(prod1);
        inMemoryDatabase.save(prod2);
        inMemoryDatabase.save(prod3);

        System.out.println("Save test : " + result
                (tester(expected, inMemoryDatabase.getProducts())));
    }

    void findTest1() {
        inMemoryDatabase.save(prod1);
        inMemoryDatabase.save(prod2);
        inMemoryDatabase.save(prod3);

        System.out.println("Find test (YES) : " + result
                (inMemoryDatabase.findByTitle("Car").isPresent()));
    }

    void findTest2() {
        inMemoryDatabase.save(prod1);
        inMemoryDatabase.save(prod2);
        inMemoryDatabase.save(prod3);

        System.out.println("Find test (NO) : " + result
                (inMemoryDatabase.findByTitle("Plane").equals(Optional.empty())));
    }
}
