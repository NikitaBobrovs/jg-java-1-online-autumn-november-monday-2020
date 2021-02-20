package students.viktors_cesnokovs.lesson_10.level_3.task_7;

import java.util.Optional;

interface ProductDatabase {  // Этот интерфейс не является функциональным.

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
