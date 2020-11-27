package students.viktors_cesnokovs.lesson_3.level_5.task_19;

public class Dog {
    String name;
    String color;
    int age;

    public Dog(String name , int age , String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void happyBirthday(){ this.age = this.age + 1; }
    void changeColor(String newColor){ this.color = newColor; }

    void voice() {
        System.out.println("My name is " + this.name + ", i am " + this.age + " years old and i am " + this.color +".");
    }
}


class DogDemo{
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex",5, "grey");
        myDog.voice();
        System.out.println();

        myDog.happyBirthday();
        myDog.voice();
        System.out.println();

        myDog.changeColor("green");
        myDog.voice();
        System.out.println();
    }
}