package students.jana_sergejenko.lesson_3.level_5.task_20;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Reks", 4);
        String getVoice = myDog.getVoice();
        System.out.println("Dog name = " + getVoice);
        myDog.happyBirthday();
        int getAge= myDog.getAge();
        System.out.println("Dog name = " + getVoice);
        System.out.println("Dog new age = " + getAge);
    }
}