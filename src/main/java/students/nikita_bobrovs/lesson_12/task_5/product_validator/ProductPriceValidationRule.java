package students.nikita_bobrovs.lesson_12.task_5.product_validator;

class ProductPriceValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        /*
            - RULE-5: не должна быть пустой
            - RULE-6: должна быть больше 0
         */

        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price cannot be empty", "price");
        }
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price must be greater than 0", "price");
        }
    }
}
