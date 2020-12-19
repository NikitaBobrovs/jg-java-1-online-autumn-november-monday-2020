package students.jelena_kaverska.lesson_3.level_3;

public class RobotDemo {
    public static void main(String[] args) {
        System.out.println("Old robots without name");
        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayYourName();
        robot1.sayHello();

        Robot otherRobot = new Robot();
        otherRobot.sayYourName();
        otherRobot.sayHello();

        //Tasks 12+13
        System.out.println("Updating robots with names:");
        Robot yourRobot = new Robot("Rider");
        yourRobot.sayYourName();

        Robot oneMore = new Robot("Tom");
        oneMore.sayYourName();
    }
}