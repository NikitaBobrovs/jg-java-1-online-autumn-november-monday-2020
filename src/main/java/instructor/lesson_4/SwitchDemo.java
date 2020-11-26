package instructor.lesson_4;

public class SwitchDemo {

    public static void main(String[] args) {

        String dayOfTheWeek = "sunday";

        switch (dayOfTheWeek) {
            case "monday":
                System.out.println("it is JavaGuru lesson day");
                break;
            case "tuesday":
                System.out.println("it is homework day");
                break;
            case "wednesday":
                System.out.println("mini friday");
                break;
            case "thursday":
                System.out.println("almost friday");
                break;
            case "friday":
                System.out.println("oh yeah friday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend!");
        }

    }
}
