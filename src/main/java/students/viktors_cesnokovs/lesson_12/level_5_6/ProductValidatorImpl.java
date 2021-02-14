package students.viktors_cesnokovs.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {
    private final FieldValidationRule title = new ProductTitleValidationRule();
    private final FieldValidationRule price = new ProductPriceValidationRule();
    private final FieldValidationRule description = new ProductDescriptionValidationRule();

    @Override
    public List<ValidationException> validate(Product product) {
        List<FieldValidationRule> rules = List.of(title, price, description);

        List<ValidationException> exceptions = new ArrayList<>();

        for (FieldValidationRule rule : rules) {
            try {
                rule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
