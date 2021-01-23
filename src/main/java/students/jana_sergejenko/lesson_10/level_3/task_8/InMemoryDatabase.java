package students.jana_sergejenko.lesson_10.level_3.task_8;

import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase {

    private Product[] products = new Product[0];

    @Override
    public Product save(Product product) {
        Product[] products2 = Arrays.copyOf(products, products.length + 1);
        products2[products2.length - 1] = product;
        System.out.println(Arrays.toString(products2));
        products = Arrays.copyOf(products2, products.length + 1);
        return product;
    }

    public void printAll() {

        System.out.println("save" + Arrays.toString(products));
        System.out.println("array length: " + products.length);

    }

    @Override
    public Product findByTitle(String productTitle) {

        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ProductDatabase test = new InMemoryDatabase();
        Product product = new Product("Book");
        Product product1 = new Product("Pencil");
        test.save(product);
        test.save(product1);
        System.out.println(test.findByTitle("Pencil"));
        test.printAll();


    }

}
