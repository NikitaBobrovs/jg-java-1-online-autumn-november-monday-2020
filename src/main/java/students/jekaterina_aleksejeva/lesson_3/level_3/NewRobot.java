package students.jekaterina_aleksejeva.lesson_3.level_3;

public class NewRobot {
        public void sayHello() {
            System.out.println("Hello");
        }
        public NewRobot() {
        }

        String name;

    NewRobot(String newRobotName) {
        this.name = newRobotName;
    }
    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}


