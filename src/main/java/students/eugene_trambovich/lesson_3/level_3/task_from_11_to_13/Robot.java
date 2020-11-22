package students.eugene_trambovich.lesson_3.level_3.task_from_11_to_13;

public class Robot {

    String name;

    Robot(String robotName) {
        this.name = robotName;

    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {

        System.out.println("My name is " + this.name);
        System.out.println();
    }
}
