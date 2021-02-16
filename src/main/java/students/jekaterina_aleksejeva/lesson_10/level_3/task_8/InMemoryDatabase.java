package students.jekaterina_aleksejeva.lesson_10.level_3.task_8;

import java.util.Arrays;


class InMemoryDatabase implements ProductDatabase {

    private Product[] products = new Product[]{};

    @Override
    public void save(Product product) {
        Product[] saved = Arrays.copyOf(products, products.length + 1);
        saved[saved.length - 1] = product;
        products = Arrays.copyOf(saved, products.length + 1);

    }

    public Product[] getProducts() {
        return products;
    }

    public void printProductsToConsole() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public Product findByTitle(String productTitle) {

        for (Product product : products) {
            if (!product.getTitle().equals(productTitle)) {
                continue;
            }
            if (product.getTitle().equals(productTitle)) {
                return product;
            }

        }
        return null;


    }

}

class InMemoryDatabaseDemo {
    public static void main(String[] args) {
        InMemoryDatabase demo = new InMemoryDatabase();
        System.out.println("Empty list of products: ");
        demo.printProductsToConsole();
        System.out.println("Updated list of products + 5 products: ");
        demo.save(new Product("coffee"));
        demo.save(new Product("chocolate"));
        demo.save(new Product("apple"));
        demo.save(new Product("water"));
        demo.save(new Product("banana"));
        demo.printProductsToConsole();
        System.out.println("Find product results: ");
        System.out.println(demo.findByTitle("apple"));
        System.out.println(demo.findByTitle("banana"));
        System.out.println(demo.findByTitle("milk"));

    }

}


class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.isSavingProducts();
        test.isFindingProduct();
        test.isFindingNoProduct();
    }

    InMemoryDatabase data = new InMemoryDatabase();

    void isSavingProducts() {
        String scenario = "Adding 1 product = ";
        Product one = new Product("cake");
        Product[] expected = new Product[]{one};
        data.save(one);
        Product[] actual = data.getProducts();
        if (Arrays.equals(expected, actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void isFindingProduct() {
        String scenario = "Finding a product = ";
        data.save(new Product("lemon"));
        data.save(new Product("orange"));
        data.save(new Product("kiwi"));
        Product expected = new Product("orange");
        Product actual = data.findByTitle("orange");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void isFindingNoProduct() {
        String scenario = "Finding no product = ";
        data.save(new Product("lemon"));
        data.save(new Product("orange"));
        data.save(new Product("kiwi"));
        Product expected = null;
        Product actual = data.findByTitle("milk");
        if (expected == actual) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

}
