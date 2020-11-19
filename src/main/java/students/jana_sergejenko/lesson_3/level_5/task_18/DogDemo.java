package students.jana_sergejenko.lesson_3.level_5.task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Reks");
        String getVoice = myDog.getVoice();
        for (int i = 0; i < 3; i++) {
            System.out.println("Dog name = " + getVoice);
        }

    }
}