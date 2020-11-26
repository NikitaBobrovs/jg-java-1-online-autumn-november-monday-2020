package instructor.lesson_4;

public class Shop {

    public static void main(String[] args) {
        System.out.println("Welcome to the Shop!");

        boolean hasBrownBread = false;

        if (hasBrownBread) {
            System.out.println("Pack the bread!"); // 1
        } else {
            System.out.println("Pack the gum!"); // 2
        }

        boolean hasWhiteWine = false;
        boolean hasRedWine = false;
        boolean hasPinkWine = false;

        if (hasWhiteWine) {
            System.out.println("Oh yes"); // 3
        } else if (hasRedWine) {
            System.out.println("Yes oh"); // 4
        } else if (hasPinkWine) {
            System.out.println("Also good"); // 5
        } else {
            System.out.println("Cola"); // 6
        }

        System.out.println("Bye!");
    }
}
