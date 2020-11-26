package students.jekaterina_aleksejeva.lesson_3.level_7.task_31;

class Product {
    String name;
    double regularPrice;
    double discount;

    Product (String name) {
        this.name = name;
    }

    double actualPrice() {
        return regularPrice - (regularPrice*discount/100);
    }

    void printInformation (){
        System.out.println ("Product name:" + name);
        System.out.println("Price, EUR: " + regularPrice);
        System.out.println("Price on sale: " + actualPrice());
    }
}
