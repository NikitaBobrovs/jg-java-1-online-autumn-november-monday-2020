package students.viktors_cesnokovs.lesson_12.level_5_6;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-1",
                    "Title can not be empty", "title");
        }
        if (product.getTitle().equals("")) {
            throw new ValidationException("RULE-1",
                    "Title can not be empty", "title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2",
                    "Product title should be more than 3 characters", "title");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3",
                    "Product title shouldn't be more than 100 characters", "title");
        }
        if (!product.getTitle().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-4",
                    "Product title should contain only english letters and numbers", "title");
        }
    }
}
