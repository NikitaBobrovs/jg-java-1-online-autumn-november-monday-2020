package students.jelena_kaverska.lesson_3.level_7.task_31;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice(){
        return regularPrice-(regularPrice*discount/100);
    }

    void printInformation(){
        System.out.println("Product: " + name + "\n"
        + "Regular price: " + regularPrice + "\n"
        + "After " + discount + "% discount: " + String.format("%.2f", actualPrice()));
    }
}