package students.viktors_cesnokovs.lesson_3.level_3.task_11_12_13;

public class RobotDemo {
    public static void main(String[] args) {
        System.out.println("Robots forever");
        Robot bot = new Robot("ROBO");
        bot.sayHello();
        bot.sayYourName();

        Robot bot1 = new Robot("Rider");                   //Task 12
        bot1.sayHello();
        bot1.sayYourName();

        Robot bot2 = new Robot("John");                    //Task 12
        bot2.sayHello();
        bot2.sayYourName();
    }
}

