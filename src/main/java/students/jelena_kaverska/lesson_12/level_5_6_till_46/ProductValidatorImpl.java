package students.jelena_kaverska.lesson_12.level_5_6_till_46;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private final FieldValidationRule name = new NameValidationRule();
    private final FieldValidationRule price = new PriceValidationRule();
    private final FieldValidationRule description = new DescriptionValidationRule();

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            name.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            price.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            description.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }
}