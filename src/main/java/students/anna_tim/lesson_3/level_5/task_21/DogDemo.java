package students.anna_tim.lesson_3.level_5.task_21;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 7, "red");
        String dogName = myDog.getDogName();
        int dogAge = myDog.getDogAge();
        String dogColour = myDog.dogColour;

        System.out.println("Dog's name is " + dogName);
        System.out.println("The Dog is " + dogAge + " years old");
        System.out.println("The Dog is " + dogColour);


        myDog.voice();
        myDog.happyBirthday();
    }
}