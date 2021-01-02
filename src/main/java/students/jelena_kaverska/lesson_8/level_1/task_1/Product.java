package students.jelena_kaverska.lesson_8.level_1.task_1;

class Product {
    private String name;
    private double price;

    public Product(){
        System.out.println("default constructor");
    }
}
class ProductDemo{
    public static void main(String[] args) {
        Product p = new Product();
    }
}