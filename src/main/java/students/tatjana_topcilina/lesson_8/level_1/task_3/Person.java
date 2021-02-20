package students.tatjana_topcilina.lesson_8.level_1.task_3;

public class Person {


    private String fullName;
    private int age;
    private Address address;
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Full name " + person.fullName);
        System.out.println("Age " + person.age);
        System.out.println("Address " + person.address);
    }

}

class Address {
}