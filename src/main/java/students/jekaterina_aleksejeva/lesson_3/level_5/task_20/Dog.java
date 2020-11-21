package students.jekaterina_aleksejeva.lesson_3.level_5.task_20;

class Dog {
    String dogName;
    Integer dogAge;
    Integer newDogAge;

    Dog(String dogName, Integer dogAge)
    {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.newDogAge = dogAge + 1;
    }
    public void getDogVoice () {
        System.out.println("My name is " + dogName + "!" + "I am " + dogAge + " years old!");
    }
    void happyBirthday() {
        System.out.println("Happy Birthday, your are " + newDogAge + " years old today!");
        System.out.println("My name is " + dogName + "!" + "I am " + newDogAge + " years old!");

    }
}

