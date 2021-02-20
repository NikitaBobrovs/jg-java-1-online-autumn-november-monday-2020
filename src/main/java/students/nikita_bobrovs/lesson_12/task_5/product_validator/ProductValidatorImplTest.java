package students.nikita_bobrovs.lesson_12.task_5.product_validator;
/*
К названию продукта выдвигаются следующие требования:
- RULE-1: не должно быть пустым
- RULE-2: не должно быть короче 3 символов
- RULE-3: не должно быть длиннее 100 символов
- RULE-4: должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- RULE-5: не должна быть пустой
- RULE-6: должна быть больше 0

К описанию продукта выдвигаются следующие требования:
- RULE-7: не должно быть длиннее 2000 символов
- RULE-8: должно содержать только английские буквы и цифры, другие символы не допустимы
 */

import java.util.Arrays;
import java.util.List;

class ProductValidatorImplTest {

    private final ProductValidator validator = new ProductValidatorImpl();

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.titleRule1_v1();
        test.titleRule1_v2();
        test.titleRule2_v1();
        test.titleRule3_v1();
        test.titleRule4_v1();
        test.priceRule5_v1();
        test.priceRule6_v1();
        test.descriptionRule7_v1();
        test.descriptionRule8_v1();
        test.multipleRules_v1();
        test.multipleRules_v2();
        test.multipleRules_v3();
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void titleRule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1 name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1 field");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void titleRule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1_v2 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1_v2 name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1_v2 field");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1_v2");
    }

    public void titleRule2_v1() {
        Product product = new Product("ab", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2 name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Title can not be shorter than 3 characters"), "rule2");
    }

    public void titleRule3_v1() {
        String[] strings = new String[102];
        Arrays.fill(strings, "S");

        Product product = new Product(Arrays.toString(strings), 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3 name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Title can not be longer than 100 characters"), "rule3");
    }

    public void titleRule4_v1() {
        Product product = new Product("abc$%Д", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4 name");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Title can contain only english letter and numbers"), "rule4");
    }

    public void priceRule5_v1() {
        Product product = new Product("abcd", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5 name");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Price cannot be empty"), "rule5");
    }

    public void priceRule6_v1() {
        Product product = new Product("abcd", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6 name");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Price must be greater than 0"), "rule6");
    }

    public void descriptionRule7_v1() {
        String[] strings = new String[2002];
        Arrays.fill(strings, "S");
        Product product = new Product("abcd", 1, Arrays.toString(strings));
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7 name");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Description can not be longer than 2000 characters"), "rule7");
    }

    public void descriptionRule8_v1() {
        Product product = new Product("abcd", 1, "abcd&*%5ПРОДУКТ");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8 size");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8 name");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8 field");
        checkResult(exceptions.get(0).getDescription()
                .equals("Description can contain only english letters and numbers"), "rule8");
    }

    public void multipleRules_v1() {
        Product product = new Product("ab", 1, "abcd&*%5ПРОДУКТ");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "multiple rules size");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-2", "Title can not be shorter than 3 characters", "title")), "rule 2");
        checkResult(exceptions.contains(new ValidationException
                        ("RULE-8", "Description can contain only english letters and numbers", "description")),
                "rule 8");
    }

    public void multipleRules_v2() {
        String[] strings = new String[2002];
        Arrays.fill(strings, "S");
        Product product = new Product("", 1, Arrays.toString(strings));
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "multiple rules 2 size");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-1", "Title can not be empty", "title")), "rule 1");
        checkResult(exceptions.contains(new ValidationException
                        ("RULE-7", "Description can not be longer than 2000 characters", "description")),
                "rule 7");
    }

    public void multipleRules_v3() {
        String[] strings = new String[2002];
        Arrays.fill(strings, "S");
        Product product = new Product(null, 0, Arrays.toString(strings));
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "multiple rules 3 size");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-1", "Title can not be empty", "title")), "rule 1");
        checkResult(exceptions.contains(new ValidationException
                        ("RULE-7", "Description can not be longer than 2000 characters", "description")),
                "rule 7");
        checkResult(exceptions.contains(new ValidationException("RULE-6", "Price must be greater than 0", "price")),
                "rule 6");
    }
}
