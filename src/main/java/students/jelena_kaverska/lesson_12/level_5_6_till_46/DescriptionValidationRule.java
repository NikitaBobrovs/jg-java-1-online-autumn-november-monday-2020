package students.jelena_kaverska.lesson_12.level_5_6_till_46;

class DescriptionValidationRule implements FieldValidationRule {
    // - не должно быть длиннее 2000 символов
    //- должно содержать только английские буквы и цифры, другие символы не допустимы

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription() == null) {
            throw new ValidationException("Empty product description", "Product description cannot be empty", "description");
        }
        if (product.getDescription().length() > 300) {
            throw new ValidationException("Invalid product description length", "Description should not exceed 300 chars", "description");
        }
        if (!product.getDescription().matches("^*[a-zA-Z0-9\\s]*$")) {
            throw new ValidationException("Invalid product description symbols", "Product description should contain only alpha numeric characters + spaces", "description");
        }
    }
}