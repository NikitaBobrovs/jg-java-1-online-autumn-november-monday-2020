package students.anna_tim.lesson_3.level_5.task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");
        String dogName = myDog.getDogName();
        System.out.println("Dog's name is " + dogName);

        myDog.voice();
    }
}
