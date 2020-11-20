package students.jana_sergejenko.lesson_3.level_7.task_29;

import students.jana_sergejenko.lesson_3.level_7.task_29.Lamp;

class LampDemo {
    public static void main(String[] args) {

        Lamp led = new Lamp("white","glass");
        Lamp halogen = new Lamp("blue","glass");
        led.turnOn();
        halogen.turnOff();
        led.printInfo();
        halogen.printInfo();
    }
}
