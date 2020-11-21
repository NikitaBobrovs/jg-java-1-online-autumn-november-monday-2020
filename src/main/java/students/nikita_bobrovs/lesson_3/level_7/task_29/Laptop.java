package students.nikita_bobrovs.lesson_3.level_7.task_29;

public class Laptop {
    String brand;
    String condition;
    double price;

    Laptop(String brand,String condition,double price){
        this.brand=brand;
        this.condition=condition;
        this.price=price;
    }
   void changePrice(double changePrice){
        this.price = changePrice;
    }
   void laptopSpecs(){
        System.out.println("This is "+this.condition+" "+this.brand+" laptop, which costs: "+this.price+"$");
    }
}

class LaptopDemo{
    public static void main(String[] args) {

        Laptop pc1 = new Laptop("Lenovo", "new", 200);
        pc1.laptopSpecs();

        pc1.changePrice(179.99);
        pc1.laptopSpecs();
        System.out.println();


        Laptop pc2 = new Laptop("HP","used",99.50);
        pc2.laptopSpecs();
    }
}
