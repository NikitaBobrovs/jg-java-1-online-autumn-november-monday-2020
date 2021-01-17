package students.nikita_bobrovs.lesson_10.level_3.task_7;

import java.util.Optional;

interface ProductDatabase {                 // This is not functional interface.

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
