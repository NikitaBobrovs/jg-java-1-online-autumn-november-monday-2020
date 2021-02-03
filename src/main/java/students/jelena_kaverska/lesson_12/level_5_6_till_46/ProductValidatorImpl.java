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
        List<FieldValidationRule> rules = List.of(name, price, description);
        for (FieldValidationRule rule : rules) {
            try {
                rule.validate(product);
            }
            catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}