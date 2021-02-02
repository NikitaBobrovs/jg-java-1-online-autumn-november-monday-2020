package students.jelena_kaverska.lesson_12.level_5_6_till_46;

import java.util.List;

interface ProductValidator {

    List<ValidationException> validate(Product product);
}