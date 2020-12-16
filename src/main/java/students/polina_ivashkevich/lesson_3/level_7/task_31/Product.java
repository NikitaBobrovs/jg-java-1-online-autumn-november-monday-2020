package students.polina_ivashkevich.lesson_3.level_7.task_31;

public class Product {
    String name = "Milk";
    double regularPrice = 1.15;
    double discount = 30;
    double actualPrice;

    public double actualPrice() {
        actualPrice=regularPrice*discount/100;
        return actualPrice;



    } public void printInformation() {


        System.out.println("Product name: "+name);
        System.out.println("Regular price is: "+"$ " + regularPrice  );
        System.out.println("Discount: "+discount + " %");
        System.out.println("Actual price is: " +"$"+ actualPrice);
    }

}
