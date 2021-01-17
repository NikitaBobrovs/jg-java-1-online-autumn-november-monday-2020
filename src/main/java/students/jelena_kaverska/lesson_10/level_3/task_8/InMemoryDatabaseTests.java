package students.jelena_kaverska.lesson_10.level_3.task_8;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabaseTests {
    private InMemoryDatabase productDatabase;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testProductSave() {
        Product product = new Product("aaa");
        Product[] expectedProducts = new Product[]{product};
        productDatabase = new InMemoryDatabase();
        productDatabase.save(product);
        System.out.println("Adding product: " +
                printResults(Arrays.equals(expectedProducts, productDatabase.getProducts())));
    }

    void testProductFind() {
        Product[] products = new Product[]{new Product("aaa")};
        Optional<Product> expectedProduct = Optional.of(products[products.length - 1]);
        productDatabase = new InMemoryDatabase();
        productDatabase.save(new Product("aaa"));
        Optional<Product> actualProduct = productDatabase.findByTitle2("aaa");
        System.out.println("Finding product: " +
                printResults(expectedProduct.equals(actualProduct)));
    }

    void testProductFind2() {
        Optional<Product> expectedProduct = Optional.empty();
        productDatabase = new InMemoryDatabase();
        productDatabase.save(new Product("aaa"));
        Optional<Product> actualProduct = productDatabase.findByTitle2("aaaa");
        System.out.println("Finding product: " +
                printResults(expectedProduct.equals(actualProduct)));
    }


    public static void main(String[] args) {
        InMemoryDatabaseTests tests = new InMemoryDatabaseTests();
        tests.testProductSave();
        tests.testProductFind();
        tests.testProductFind2();

    }
}