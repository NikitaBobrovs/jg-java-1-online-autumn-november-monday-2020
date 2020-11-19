package students.jelena_kaverska.lesson_3.level_5.task_22;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Flera", 5, "Black");
        System.out.println("initial dog");
        myDog.voice();
        myDog.changeColor("Red");
        System.out.println();
        System.out.println("updated dog");
        myDog.voice();
    }
}