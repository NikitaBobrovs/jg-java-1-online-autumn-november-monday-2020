package students.polina_ivashkevich.lesson_3.level_7.task_29;

import java.util.Scanner;

public class CreditCard {
    String sound = "BIB-BIB";
    String form = "Square";
    String color = "Gold";
    int pin = 312;
    String userName = "Samanta Rechi";
    long cardNumber =3451876547891234l;
    public void specifications (){
        System.out.println("Card specifications : ");
        System.out.println(form);
        System.out.println(color);
        System.out.println(userName);
        System.out.println(cardNumber);
        System.out.println(pin);
    }
    public void functionPay() {
        java.util.Scanner pin = new Scanner(System.in);
        System.out.println("Print your card pin please ");
        int pin1 = pin.nextInt();
        System.out.println("Your pin : " +pin1);
        System.out.println(sound);
        System.out.println("Thanks for purchase!");
    }


}
