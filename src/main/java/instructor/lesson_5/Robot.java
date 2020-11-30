package instructor.lesson_5;

class RobotArmy {

    public static void main(String[] args) {

        Robot[] army = new Robot[5];
        army[0] = new Robot();
        army[0].name = "ROBO";
        army[0].greet();

        army[1] = new Robot();
        army[1].name = "COP";
        army[1].greet();

        army[2] = new Robot();
        army[2].name = "T502";
        army[2].greet();

    }
}

class Robot {

    String name;

    public void greet() {
        System.out.println("My name is " + name);
    }

}
