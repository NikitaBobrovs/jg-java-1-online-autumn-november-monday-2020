package students.nikita_bobrovs.lesson_12.task_5.product_validator;

interface ProductValidationRule {
    void validate(Product product) throws ValidationException;
}
