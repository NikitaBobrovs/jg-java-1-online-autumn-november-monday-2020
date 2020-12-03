package students.jana_sergejenko.lesson_3.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Book");
        product.regularPrice=12.4;
        product.discount=2.00;
        product.actualPrice();
        product.printInformation();
    }
}
