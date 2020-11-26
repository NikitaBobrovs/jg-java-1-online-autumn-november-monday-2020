package students.jelena_kaverska.lesson_3.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Phone");
        myProduct.regularPrice = 995.50;
        myProduct.discount = 5.5;
        myProduct.printInformation();

        System.out.println("\nWithout discount..");
        Product withoutDiscount = new Product("Table", 545.50);
        withoutDiscount.printInformation();
    }
}