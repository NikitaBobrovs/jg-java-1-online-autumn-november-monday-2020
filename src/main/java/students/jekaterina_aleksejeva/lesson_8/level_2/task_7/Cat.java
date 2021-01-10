package students.jekaterina_aleksejeva.lesson_8.level_2.task_7;

class Cat {
    String name;
    String colour;
    String behaviour;
    int age;

    Cat(String name, String colour, String behaviour, int age) {
        this.name = name;
        this.colour = colour;
        this.behaviour = behaviour;
        this.age = age;
    }
}

class Bass extends Cat {

    Bass() {
        super("Bass", "grey", "intelligent", 5);
    }

}

