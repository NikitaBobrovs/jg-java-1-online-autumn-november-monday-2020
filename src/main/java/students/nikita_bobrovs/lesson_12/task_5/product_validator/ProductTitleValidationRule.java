package students.nikita_bobrovs.lesson_12.task_5.product_validator;

class ProductTitleValidationRule implements ProductValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
                /*
            - RULE-1: не должно быть пустым
            - RULE-2: не должно быть короче 3 символов
            - RULE-3: не должно быть длиннее 100 символов
            - RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы
         */
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
        if (product.getTitle().equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }
        if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 characters", "title");
        }
        if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 characters", "title");
        }
        if (!product.getTitle().matches("^[a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-4", "Title can contain only english letter and numbers", "title");
        }
    }
}
