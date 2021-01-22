package instructor.qa;

public class Procedure {

    public static void main(String[] args) {

        System.out.println("Hello, User!");
        printMenu();

    }

    public static void printMenu() {
        System.out.println("Please, select installation option:");
        System.out.println("1) Install fresh");
        System.out.println("2) Install existing");
        System.out.println("3) Other..");
    }
}

