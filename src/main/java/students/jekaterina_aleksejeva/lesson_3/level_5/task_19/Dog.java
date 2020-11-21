package students.jekaterina_aleksejeva.lesson_3.level_5.task_19;

class Dog {
    String dogName;
    Integer dogAge;

    Dog(String dogName, Integer dogAge)
    {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    public void getDogVoice () {
        System.out.println("My name is " + dogName + "!" + "I am " + dogAge + " years old!");
    }

}

class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Trezor",2);
        myDog.getDogVoice();
    }
}

