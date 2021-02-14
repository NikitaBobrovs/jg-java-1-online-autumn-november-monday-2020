package students.viktors_cesnokovs.lesson_12.level_5_6;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "Price shouldn't be empty", "price");
        }
        if (product.getPrice() <= 0) {
            throw new ValidationException("RULE-6", "Price should be greater than 0", "price");
        }
    }
}
