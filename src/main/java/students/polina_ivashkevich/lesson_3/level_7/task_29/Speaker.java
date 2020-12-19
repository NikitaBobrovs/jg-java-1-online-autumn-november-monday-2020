package students.polina_ivashkevich.lesson_3.level_7.task_29;

public class Speaker {
    String firm = "JBL";
    String form = "Oval";
    byte dynamicCount = 2;
    String color = "Red";
    int batteryWh= 27;
    byte bottoms = 4;
    int releaseYear = 2017;
    boolean turnOn = true;

    public void specifications(){
        System.out.println("Speaker specifications :");
        System.out.println("Firm name :" + firm);
        System.out.println("Form :" + form);
        System.out.println("Dynamic count :"+ dynamicCount);
        System.out.println("Color :"+ color);
        System.out.println("Battery (Wh)" + batteryWh);
        System.out.println("Bottom count :"+  bottoms);
        System.out.println("Year of release :" +releaseYear);
    }public void functions(){
        System.out.println("Turn on your speaker");
        if (turnOn == true) {
            System.out.println("Let's go dance!");
        }
    }
}
