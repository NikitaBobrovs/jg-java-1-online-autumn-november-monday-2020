package students.jana_sergejenko.lesson_3.level_7.task_31;

public class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    double actualPrice() {
        return regularPrice - discount;
    }
    void printInformation() {
        System.out.println("Product name: " + this.name + "\nprice: " + regularPrice + "\ndiscount " + discount+"\nactual price "+(regularPrice - discount));
    }
}
