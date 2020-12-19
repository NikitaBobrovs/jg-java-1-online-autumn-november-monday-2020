package students.jana_sergejenko.lesson_3.level_3.task_13;

public class Robot {
    String name;

    Robot(String robotName) {
        this.name = robotName;
    }
    public static void sayHello() {
        System.out.print("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
