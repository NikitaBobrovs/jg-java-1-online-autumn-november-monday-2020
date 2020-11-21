package students.jekaterina_aleksejeva.lesson_3.level_5.task_21;

class Dog {
    String name;
    Integer age;
    String colour;

    Dog(String name, Integer age, String colour)
    {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    public void voice () {
        System.out.println("My name is " + name + " and I am " + age + " years old!");
        System.out.println("My colour: " + colour);
    }
}

