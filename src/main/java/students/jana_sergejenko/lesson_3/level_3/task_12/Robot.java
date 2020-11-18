package students.jana_sergejenko.lesson_3.level_3.task_12;

public class Robot {
    String robotName;

    Robot(String robotName) {
        this.robotName = robotName;
    }
    public static void sayHello() {
        System.out.print("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + robotName);
    }

}
