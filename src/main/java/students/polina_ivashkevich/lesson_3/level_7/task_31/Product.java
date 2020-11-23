package students.polina_ivashkevich.lesson_3.level_7.task_31;

public class Product {
    String name = "Milk";
    double regularPrice = 1.15;
    double discount = 30;
    double actualPrice;

    public void actualPrice() {
        System.out.println("Актуальная цена, с учетом скидки $ :");
        actualPrice=regularPrice*discount/100;
        System.out.println(name +" $ " +actualPrice );


    } public void printInformation() {
        System.out.println(name);
        System.out.println("$ " + regularPrice  );
        System.out.println(discount + " %");
    }

}
