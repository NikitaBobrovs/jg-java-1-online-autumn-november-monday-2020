package students.nikita_bobrovs.lesson_10.level_3.task_7;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest subject = new InMemoryDatabaseTest();
        subject.saveTest();
        subject.findByTitleTest1();
        subject.findByTitleTest2();
    }

    private final InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
    private final Product product1 = new Product("Bread");
    private final Product product2 = new Product("Water");

    private String testResults(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private boolean arrayTester(Product[] expected, Product[] real) {
        return Arrays.equals(expected, real);
    }

    void saveTest() {
        Product[] expected = {product1, product2};

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        System.out.println("Save product test : " + testResults
                (arrayTester(expected, inMemoryDatabase.getProducts())));
    }

    void findByTitleTest1() {
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        System.out.println("Find product test (contains) : " + testResults
                (inMemoryDatabase.findByTitle("Bread").isPresent()));
    }

    void findByTitleTest2() {
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        System.out.println("Find product test (null) : " + testResults
                (inMemoryDatabase.findByTitle("Milk").equals(Optional.empty())));
    }
}
