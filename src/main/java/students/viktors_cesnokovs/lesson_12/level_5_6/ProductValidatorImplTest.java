package students.viktors_cesnokovs.lesson_12.level_5_6;


import java.util.List;

class ProductValidatorImplTest {
    private final ProductValidator validator = new ProductValidatorImpl();

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
        test.allRules();
        test.multipleRules();
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1 'Field'");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1 'Field'");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("ab", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2 'Field'");
        checkResult(exceptions.get(0).getDescription()
                .equals("Product title should be more than 3 characters"), "rule2");
    }

    public void rule3_v1() {

        Product product = new Product("qwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiopqwertyuiop", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3 'Field'");
        checkResult(exceptions.get(0).getDescription()
                .equals("Product title shouldn't be more than 100 characters"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("abc$%", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4 'Field'");
        checkResult(exceptions.get(0).getDescription()
                .equals("Product title should contain only english letters and numbers"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("qwert", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5 'Field'");
        checkResult(exceptions.get(0).getDescription()
                .equals("Price shouldn't be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("qwert", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6 'Field'");
        checkResult(exceptions.get(0).getDescription()
                .equals("Price should be greater than 0"), "rule6");
    }

    public void rule7_v1() {
        Product product = new Product("qwert", 1, "qwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopa");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7 'Name'");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7 'Field'");
        checkResult(exceptions.get(0).getDescription()
                .equals("Description is not allowed to be longer than 150 chars"), "rule7");
    }

    public void rule8_v1() {
        Product product = new Product("qwert", 1, "abcd&*%5");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8 'Size'");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8 'Name''");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8 'Field''");
        checkResult(exceptions.get(0).getDescription()
                .equals("Description can contain only english letters and numbers"), "rule8");
    }

    public void allRules() {
        Product product = new Product("qw", null, "abcd&*%5");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "allRules 'Size'");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-2",
                        "Product title should be more than 3 characters", "title")), "rule1");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-5", "Price shouldn't be empty", "price")), "rule5");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-8",
                        "Description can contain only english letters and numbers", "description")), "rule8");
    }

    public void multipleRules() {
        Product product = new Product("", 2, "qwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopaqwertyuiopa");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "allRules 'Size'");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-1",
                        "Title can not be empty", "title")), "rule1");
        checkResult(exceptions.contains(new ValidationException
                ("RULE-7",
                        "Description is not allowed to be longer than 150 chars", "description")), "rule8");
    }
}
