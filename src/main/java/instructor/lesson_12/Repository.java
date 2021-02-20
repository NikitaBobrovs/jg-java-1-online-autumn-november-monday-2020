package instructor.lesson_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface Repository<ID, RECORD> {

    List<RECORD> findAll();

    Optional<RECORD> findById(ID id);

    ID save(RECORD record);

    boolean delete(ID id);
}

class StringRepository implements Repository<Integer, String> {

    private final Map<Integer, String> idx = new HashMap<>();

    @Override
    public List<String> findAll() {
        return new ArrayList<>(idx.values());
    }

    @Override
    public Optional<String> findById(Integer integer) {
        return Optional.ofNullable(idx.get(integer));
    }

    @Override
    public Integer save(String s) {
        idx.put(0, s);
        return 0;
    }

    @Override
    public boolean delete(Integer integer) {
        idx.remove(integer);
        return true;
    }
}


abstract class AbstractInMemoryRepository<ID, RECORD> implements Repository<ID, RECORD> {

    protected final Map<ID, RECORD> idx = new HashMap<>();

    @Override
    public List<RECORD> findAll() {
        return new ArrayList<>(idx.values());
    }

    @Override
    public Optional<RECORD> findById(ID id) {
        return Optional.ofNullable(idx.get(id));
    }

    @Override
    public boolean delete(ID id) {
        idx.remove(id);
        return true;
    }
}

abstract class AbstractUuidInMemoryRepository<RECORD> extends AbstractInMemoryRepository<UUID, RECORD> {

    @Override
    public UUID save(RECORD record) {
        UUID id = UUID.randomUUID();
        idx.put(id, record);
        return id;
    }
}

class BookRepository extends AbstractInMemoryRepository<String, Book> {

    @Override
    public String save(Book book) {
        return null;
    }
}

class ProductRepository extends AbstractUuidInMemoryRepository<Product> {

}

class RepositoryDemo {

    public static void main(String[] args) {

        Repository<UUID, Product> productRepository = new ProductRepository();

        productRepository.save(new Product("Milk"));
        productRepository.save(new Product("Bread"));
        productRepository.save(new Product("Water"));

        System.out.println(productRepository.findAll());

    }
}

class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Book {

    private String id;

}
