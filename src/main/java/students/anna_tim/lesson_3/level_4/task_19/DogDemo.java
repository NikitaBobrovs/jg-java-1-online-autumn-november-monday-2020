package students.anna_tim.lesson_3.level_4.task_19;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 7);
        String dogName = myDog.getDogName();
        int dogAge = myDog.getDogAge();

        System.out.println("Dog's name is " + dogName);
        System.out.println("The Dog is " + dogAge + " years old");

        myDog.voice();
    }
}
