package students.nikita_bobrovs.lesson_3.level_7.task_29;

public class Laptop {
    String brand;
    String condition;
    double price;

    Laptop(String getBrand,String getCondition,double getPrice){
        this.brand=getBrand;
        this.condition=getCondition;
        this.price=getPrice;
    }
   void discount(double newPrice){
        this.price = newPrice;
    }
   void laptopSpecs(){
        System.out.println("This is "+this.condition+" "+this.brand+" laptop, which costs: "+this.price+"$");
    }
}

class LaptopDemo{
    public static void main(String[] args) {

        Laptop PC1 = new Laptop("Lenovo", "new", 200);
        PC1.laptopSpecs();

        PC1.discount(179.99);
        PC1.laptopSpecs();
        System.out.println();


        Laptop PC2 = new Laptop("HP","used",99.50);
        PC2.laptopSpecs();
    }
}