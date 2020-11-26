package students.jekaterina_aleksejeva.lesson_3.level_7.task_31;

class ProductDemo {
    public static void main(String[] args) {
        Product productSale = new Product("Camera");
        productSale.regularPrice = 200.15;
        productSale.discount = 40.00;
        productSale.printInformation();
    }
}
