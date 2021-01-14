package students.jelena_kaverska.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryDatabaseTests {
    private InMemoryDatabase productDatabase;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testProductSave() {
        Product product = new Product("aaa");
        Product[] expectedProducts = new Product[]{null, product};
        productDatabase = new InMemoryDatabase();
        productDatabase.save(product);
        System.out.println("Adding product: " +
                printResults(Arrays.equals(expectedProducts, productDatabase.getProducts())));
    }

    void testProductFind() {
        Product[] products = new Product[]{null, new Product("aaa")};
        Product expectedProduct = products[products.length - 1];
        productDatabase = new InMemoryDatabase();
        productDatabase.save(expectedProduct);
        Product actualProduct = productDatabase.findByTitle("aaa");
        System.out.println("Finding product: " +
                printResults(expectedProduct.equals(actualProduct)));
    }

    public static void main(String[] args) {
        InMemoryDatabaseTests tests = new InMemoryDatabaseTests();
        tests.testProductSave();
        tests.testProductFind();
    }
}