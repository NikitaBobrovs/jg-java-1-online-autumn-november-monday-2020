package students.jelena_kaverska.lesson_12.level_5_6_till_46;

import java.util.List;

class ProductValidatorImplTest {
    private final ProductValidator validator = new ProductValidatorImpl();

    private String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testNameNonEmpty() {
        System.out.print("Test name non empty: ");
        Product product = new Product(null, 120, "Kitchen table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Empty product name",
                "Product name cannot be empty", "name"))));
    }

    void testNameMinLength() {
        System.out.print("Test name min length: ");
        Product product = new Product("Ta", 120, "Kitchen table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Invalid product name length",
                "Product name cannot be less than 3 symbols", "name"))));
    }

    void testNameMaxLength() {
        System.out.print("Test name max length: ");
        Product product = new Product("tabletabletabletabletabletabletabletabletabletabletabletabletabletabletabletabletabletabletabletabletable", 120, "Kitchen table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Invalid product name length",
                "Product name cannot be more than 100 symbols", "name"))));
    }

    void testNameChars() {
        System.out.print("Test name alpha numeric chars: ");
        Product product = new Product("table12%", 120, "Kitchen table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Invalid product name symbols",
                "Product name should contain only alpha numeric characters", "name"))));
    }

    void testPriceNonEmpty() {
        System.out.print("Test price non empty: ");
        Product product = new Product("table", null, "Kitchen table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Empty product price",
                "Price should not be empty", "price"))));
    }

    void testPrice0() {
        System.out.print("Test price 0 value: ");
        Product product = new Product("table", 0, "Kitchen table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Invalid price value",
                "Price should be > 0", "price"))));
    }

    void testDescriptionNonEmpty() {
        System.out.print("Test description non empty: ");
        Product product = new Product("Table", 120, null);
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Empty product description",
                "Product description cannot be empty", "description"))));
    }

    void testDescriptionMaxLength() {
        System.out.print("Test description max length empty: ");
        Product product = new Product("Table", 120, "TableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTableTable TableTableTableTablevTableTableTableTablevvvvTableTableTableTableTableTable TableTableTableTablevTableTableTablevTableTableTable TableTableTableTableTableTableTableTableTableTable TableTableTableTableTableTableTableTableTableTable TableTablevTableTable");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Invalid product description length",
                "Description should not exceed 300 chars", "description"))));
    }

    void testDescriptionChars() {
        System.out.print("Test description alpha numeric chars: ");
        Product product = new Product("Table", 120, "table %45");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(new ValidationException("Invalid product description symbols",
                "Product description should contain only alpha numeric characters + spaces", "description"))));
    }

    void testInvalidAllProperties() {
        System.out.print("Test all invalid: ");
        Product product = new Product("Ta", 0, "table %45");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(
                new ValidationException("Invalid product description symbols", "Product description should contain only alpha numeric characters + spaces",
                "description"))));
        System.out.println(printResults(exceptions.contains(
                new ValidationException("Invalid product name length", "Product name cannot be less than 3 symbols", "name"))));
        System.out.println(printResults(exceptions.contains(
                new ValidationException("Invalid price value", "Price should be > 0", "price"))));
    }

    void testInvalidMultipleProperties() {
        System.out.print("Test multiple invalid: ");
        Product product = new Product("To", null, "table");
        List<ValidationException> exceptions = validator.validate(product);
        System.out.println(printResults(exceptions.contains(
                new ValidationException("Invalid product name length", "Product name cannot be less than 3 symbols", "name"))));
        System.out.println(printResults(exceptions.contains(
                new ValidationException("Empty product price", "Price should not be empty", "price"))));
    }

    public static void main(String[] args) {
        ProductValidatorImplTest tests = new ProductValidatorImplTest();
        tests.testNameNonEmpty();
        tests.testNameMinLength();
        tests.testNameMaxLength();
        tests.testNameChars();
        tests.testPriceNonEmpty();
        tests.testPrice0();
        tests.testDescriptionNonEmpty();
        tests.testDescriptionMaxLength();
        tests.testDescriptionChars();
        tests.testInvalidAllProperties();
        tests.testInvalidMultipleProperties();
    }
}