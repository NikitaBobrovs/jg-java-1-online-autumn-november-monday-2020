package students.nikita_bobrovs.lesson_12.task_5.product_validator;

class ProductDescriptionValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        /*
            - RULE-7: не должно быть длиннее 2000 символов
            - RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
         */

        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "Description can not be longer than 2000 characters", "description");
        }
        if (!product.getDescription().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-8", "Description can contain only english letters and numbers", "description");
        }
    }
}
