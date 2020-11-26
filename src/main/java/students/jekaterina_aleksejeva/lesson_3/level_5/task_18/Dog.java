package students.jekaterina_aleksejeva.lesson_3.level_5.task_18;

class Dog {
    String name;

    Dog(String name)
    {
        this.name = name;
    }

   void voice() {
       System.out.println( this.name + "! " + this.name +"! " + this.name + "! ");
   }
}

class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog("Trezor");
        myDog.voice();
    }
}