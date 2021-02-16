package students.jekaterina_aleksejeva.lesson_10.level_3.task_10;

import java.util.Arrays;
import java.util.Optional;


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
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

}

class InMemoryDatabaseDemo {
    public static void main(String[] args) {
        InMemoryDatabase demo = new InMemoryDatabase();
        System.out.println("Empty list of products: ");
        demo.printProductsToConsole();
        System.out.println("Updated list of products + 3 products: ");
        demo.save(new Product("juice"));
        demo.save(new Product("tea"));
        demo.save(new Product("coffee"));
        demo.printProductsToConsole();
        System.out.println("Find product results: ");
        System.out.println(demo.findByTitle("tea"));
        System.out.println(demo.findByTitle("water"));

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
    Product one = new Product("cake");
    Product two = new Product("biscuits");
    Product three = new Product("caramel");

    void isSavingProducts() {
        String scenario = "Adding 3 products = ";
        data.save(one);
        data.save(two);
        data.save(three);
        Product[] expected = new Product[]{one, two, three};
        Product[] actual = data.getProducts();
        if (Arrays.equals(expected, actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void isFindingProduct() {
        String scenario = "Finding a product = ";
        data.save(one);
        data.save(two);
        data.save(three);
        Optional<Product> expected = Optional.of(three);
        Optional<Product> actual = data.findByTitle("caramel");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void isFindingNoProduct() {
        String scenario = "Finding no product = ";
        data.save(one);
        data.save(two);
        data.save(three);
        Optional<Product> expected = Optional.empty();
        Optional<Product> actual = data.findByTitle("milk");
        if (expected.equals(actual)) {
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

}


