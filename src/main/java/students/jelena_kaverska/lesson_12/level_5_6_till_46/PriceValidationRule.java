package students.jelena_kaverska.lesson_12.level_5_6_till_46;

class PriceValidationRule implements FieldValidationRule {
    //- не должна быть пустой
    //- не может быть 0

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("Empty product price", "Price should not be empty", "price");
        }
        if (product.getPrice() == 0) {
            throw new ValidationException("Invalid price value", "Price should be > 0", "price");
        }
    }
}