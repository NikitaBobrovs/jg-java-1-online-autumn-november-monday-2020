package students.jelena_kaverska.lesson_3.level_3;

public class Robot {
    String name;

    public Robot() {
    }

    public Robot(String name){
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}