package students.nikita_bobrovs.lesson_12.task_5.product_validator;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {
    private final ProductValidationRule title = new ProductTitleValidationRule();
    private final ProductValidationRule price = new ProductPriceValidationRule();
    private final ProductValidationRule description = new ProductDescriptionValidationRule();

    public List<ValidationException> validate(Product product) {
        List<ProductValidationRule> validationRules = List.of(title, price, description);

        List<ValidationException> exceptions = new ArrayList<>();

        for (ProductValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }
}
