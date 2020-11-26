package students.nikita_bobrovs.lesson_3.level_7.task_31;

public class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String setName){
        this.name = setName;
    }
    double actualPrice() {
        return this.regularPrice - (this.regularPrice * this.discount);
    }
    void printInformation(){
        System.out.println("Information about the product");
        System.out.println();
        System.out.println("Product name: "+this.name+"$");
        System.out.println("Product regular price: "+this.regularPrice+"$");
        System.out.println("Discount on product: "+this.discount);
        System.out.println("Product actual price: "+actualPrice()+"$");
    }
}
class ProductDemo{
    public static void main(String[] args) {
        Product product1 = new Product("Bread");
        product1.discount = 0.5;
        product1.regularPrice = 11;
        product1.printInformation();
    }
}
