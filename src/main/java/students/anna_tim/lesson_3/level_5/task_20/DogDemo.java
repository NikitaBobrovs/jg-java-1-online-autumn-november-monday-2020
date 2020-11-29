package students.anna_tim.lesson_3.level_5.task_20;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 7);
        String dogName = myDog.getDogName();
        int dogAge = myDog.getDogAge();

        System.out.println("Dog's name is " + dogName);
        System.out.println("The Dog is " + dogAge + " years old");

        myDog.voice();
        myDog.happyBirthday();

        myDog.voice();
        //убедитесь в том, что её возраст увеличился на 1.
        //тут что-то я совсем не понимаю, как мне получить моё значение this.dogAge = this.dogAge + 1;..
        System.out.println("Now the Dog is " + dogAge + " years old");
    }
}