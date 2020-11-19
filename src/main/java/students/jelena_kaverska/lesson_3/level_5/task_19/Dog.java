package students.jelena_kaverska.lesson_3.level_5.task_19;

// This Dog from Task 19
public class Dog {
    String name;
    int age;

    //name only
    public Dog(String name){
        this.name = name;
    }

    //age only
    public Dog(int age){
        this.age = age;
    }

    //both
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void voice(){
        System.out.println("Dog name: " + name + " and age: " + age);
    }
}