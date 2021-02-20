package students.nikita_bobrovs.lesson_12.task_5.product_validator;

import java.util.List;

interface ProductValidator {
    List<ValidationException> validate(Product product);
}
