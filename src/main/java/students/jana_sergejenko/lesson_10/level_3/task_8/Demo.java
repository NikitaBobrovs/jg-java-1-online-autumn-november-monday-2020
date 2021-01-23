package students.jana_sergejenko.lesson_10.level_3.task_8;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.scenario1();
        demo.scenario2();
    }

    public String checkResult(Product[] result, Product[] expected) {
        if (Arrays.toString(result).equals(Arrays.toString(expected))) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public String checkResult2(Product result, Product expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        ProductDatabase test = new InMemoryDatabase();
        final Product product = new Product("Book");
        final Product product1 = new Product("Book");
        Product[] result = {test.save(product)};
        Product[] expected = {product1};
        System.out.println("test" + checkResult(result, expected));
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(expected));
    }

    public void scenario2() {
        ProductDatabase test = new InMemoryDatabase();
        final Product product = new Product("Apple");
        final Product product1 = new Product("Apple");
        test.save(product);
        test.save(product1);
        Product result = test.findByTitle("Apple");
        Product expected = test.findByTitle("Apple");
        System.out.println("test" + checkResult2(result, expected));

    }


}

