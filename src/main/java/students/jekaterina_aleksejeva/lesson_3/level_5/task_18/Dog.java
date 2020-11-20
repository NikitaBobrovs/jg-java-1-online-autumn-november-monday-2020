package students.jekaterina_aleksejeva.lesson_3.level_5.task_18;

class Dog {
    String dogName;
    String dogVoice;

    Dog(String dogName, String dogVoice)
    {
        this.dogName = dogName;
        this.dogVoice = dogVoice;
    }
    String getDogName()
    {
        return this.dogName;
    }
    String getDogVoice()
    {
        return this.dogVoice;
    }
}

class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog("Trezor","Trezor! Trezor! Trezor!");
        String dogName = myDog.getDogName();
        String dogVoice = myDog.getDogVoice();
        System.out.println("Voice! " + dogVoice);
    }

}