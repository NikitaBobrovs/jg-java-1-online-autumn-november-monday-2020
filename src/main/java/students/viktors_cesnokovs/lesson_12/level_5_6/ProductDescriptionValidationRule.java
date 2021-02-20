package students.viktors_cesnokovs.lesson_12.level_5_6;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getDescription().length() > 150) {
            throw new ValidationException("RULE-7",
                    "Description is not allowed to be longer than 150 chars", "description");
        }
        if (!product.getDescription().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-8",
                    "Description can contain only english letters and numbers", "description");
        }
    }
}
