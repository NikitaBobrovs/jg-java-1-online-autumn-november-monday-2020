package students.jekaterina_aleksejeva.lesson_3.level_5.task_19;

class Dog {
    String name;
    Integer age;

    Dog(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }
    public void voice () {

        System.out.println("My name is " + name + "!" + " I am " + age + " years old!");
    }
}

class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog ("Trezor", 2);
        myDog.voice();
    }
}
