package students.jelena_kaverska.lesson_3.level_1.all_tasks;

public class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayYourName();
        robot1.sayHello();

        Robot otherRobot = new Robot();
        otherRobot.sayYourName();
        otherRobot.sayHello();
    }
}