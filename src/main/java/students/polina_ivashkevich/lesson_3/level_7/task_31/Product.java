package students.polina_ivashkevich.lesson_3.level_7.task_31;

public class Product {
    String name = "Milk";
    double regularPrice = 1.15;
    double discount = 30;
    double actualPrice;

    public double actualPrice() {
        return  actualPrice=regularPrice*discount/100;



    } public void printInformation() {
        System.out.println(name);
        System.out.println("$ " + regularPrice  );
        System.out.println(discount + " %");
    }

}
