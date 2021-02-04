package students.viktors_cesnokovs.lesson_10.level_3.task_7;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private Product[] products = new Product[0];

    public Product[] getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {
        Product[] prod = new Product[this.products.length + 1];
        prod = Arrays.copyOf(this.products, prod.length);
        prod[prod.length - 1] = product;
        this.products = prod;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (productTitle.equalsIgnoreCase(product.getTitle())) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
