package students.viktors_cesnokovs.lesson_3.level_7.task_31;

public class Product {
    String name;
    double regularPrice;
    double discount;

    Product( String name ){ this.name = name;}
    double actualPrice(){ return this.regularPrice - ( this.regularPrice * this.discount);}
    void printInfo(){
        System.out.println("Product : "+ this.name + ".");
        System.out.println("Product regular price : "+ this.regularPrice +"$.");
        System.out.println("Discount : "+ this.discount);
        System.out.println("Product price after discount : "+ actualPrice()+ "$.");
    }
}




class ProductDemo{
    public static void main(String[] args) {
        Product newProduct = new Product("Xiaomi MI 10");
        newProduct.discount = 0.6;
        newProduct.regularPrice = 340;
        newProduct.printInfo();
    }
}