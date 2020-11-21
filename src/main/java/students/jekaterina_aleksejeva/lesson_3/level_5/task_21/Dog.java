package students.jekaterina_aleksejeva.lesson_3.level_5.task_21;

class Dog {
    String dogName;
    Integer dogAge;
    String dogColour;

    Dog(String dogName, Integer dogAge, String dogColour)
    {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }
    public void getDogVoice () {
        System.out.println("My name is " + dogName + " and I am " + dogAge + " years old!");
        System.out.println("My colour: " + dogColour);
    }

}
