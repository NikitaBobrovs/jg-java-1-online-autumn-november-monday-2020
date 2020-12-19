package students.nikita_bobrovs.lesson_3.level_3.task_11;

public class Robot {
    String name;              //Task 11
    public void sayHello() {
        System.out.println("\"Hello!\"");
    }
    public void sayYourName() {
        System.out.println("\"My name is "+this.name+"\"");    //task 13
    }
    public Robot(String robotName){   //task12
        this.name = robotName;

    }
}