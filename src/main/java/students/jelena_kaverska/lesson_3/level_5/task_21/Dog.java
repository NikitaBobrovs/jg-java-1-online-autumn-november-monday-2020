package students.jelena_kaverska.lesson_3.level_5.task_21;

// This Dog from Task 21
public class Dog {
    String name;
    int age;
    String color;

    //name only
    public Dog(String name) {
        this.name = name;
    }

    //age only
    public Dog(int age) {
        this.age = age;
    }

    //all properties
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Dog's name: " + name + "\n"
                + "age: " + age + "\n"
                + "color: " + color);
    }

    void happyBirthday() {
        this.age = this.age + 1;
    }
}