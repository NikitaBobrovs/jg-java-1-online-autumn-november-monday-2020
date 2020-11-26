package students.jekaterina_aleksejeva.lesson_3.level_5.task_20;

class Dog {
    String name;
    Integer age;

    Dog(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public void voice () {

        System.out.println("My name is " + name + "!" + "I am " + age + " years old!");
    }
    void happyBirthday() {
        this.age = age + 1;

        System.out.println("Happy Birthday, your are " + age + " years old today!");
        System.out.println("My name is " + name + "!" + "I am " + age + " years old today!");
    }
}


