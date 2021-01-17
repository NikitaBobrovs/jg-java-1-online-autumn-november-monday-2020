package students.nikita_bobrovs.lesson_10.level_3.task_7;

import java.util.Arrays;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private Product[] products = new Product[0];

    public Product[] getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {
        Product[] pr = new Product[this.products.length + 1];
        pr = Arrays.copyOf(this.products, pr.length);
        pr[pr.length - 1] = product;
        this.products = pr;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product p : products) {
            if (productTitle.equalsIgnoreCase(p.getTitle())) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
