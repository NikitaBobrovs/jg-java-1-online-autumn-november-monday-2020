package students.anna_tim.lesson_3.level_3.task_12;

class Robot {
    //в этом свойстве наш виртуальный обьект робот будет запоминать своё имя.
    String name;

    // Это конструктор класса. У этого конструктора один параметр с названием name и типом String.
    // То есть при создании робота в его конструктор будут передавать название робота.
    Robot(String robotName) {
      this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.println("My name is "+name+".");
    }
    //в примере + this.name
    //использование name тоже работает..

    // void sayYourName() {
    // System.out.println("My name is " + this.name);

    //это из-за public void - можно name, просто void - нужно this.name - в рамка этого класса, что ли ? :)
}