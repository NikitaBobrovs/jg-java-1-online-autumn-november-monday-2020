package students.jelena_kaverska.lesson_12.level_5_6_till_46;

class NameValidationRule implements FieldValidationRule {
    //- не должно быть пустым
    //- не должно быть короче 3 символов
    //- не должно быть длиннее 100 символов
    //- должно содержать только английские буквы и цифры, другие символы не допустимы

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getName() == null) {
            throw new ValidationException("Empty product name", "Product name cannot be empty", "name");
        }
        if (product.getName().length() < 3) {
            throw new ValidationException("Invalid product name length", "Product name cannot be less than 3 symbols", "name");
        }
        if (product.getName().length() > 100){
            throw new ValidationException("Invalid product name length", "Product name cannot be more than 100 symbols", "name");
        }
        if (!product.getName().matches("^[a-zA-Z0-9]*$")) {
            throw new ValidationException("Invalid product name symbols", "Product name should contain only alpha numeric characters", "name");
        }
    }
}