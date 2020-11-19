package students.jelena_kaverska.lesson_3.level_5.task_20;

public class DogDemo {
    public static void main(String[] args) {
        Dog happyDog = new Dog("Flera", 10);

        System.out.println("Initial");
        happyDog.voice();

        happyDog.happyBirthday();
        System.out.println();
        System.out.println("Age increased");
        happyDog.voice();
    }
}