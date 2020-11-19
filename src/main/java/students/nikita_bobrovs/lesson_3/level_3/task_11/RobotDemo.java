package students.nikita_bobrovs.lesson_3.level_3.task_11;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robotOne = new Robot("ROBO");
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robotTwo = new Robot("Rider");
        robotTwo.sayHello();
        robotTwo.sayYourName();

        Robot robotThree = new Robot("John");   //task12
        robotThree.sayHello();
        robotThree.sayYourName();
    }
}
