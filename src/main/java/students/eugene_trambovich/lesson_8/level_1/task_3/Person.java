package students.eugene_trambovich.lesson_8.level_1.task_3;

class Person {

    private String fullName;
    private int age;
    private Address address;

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("person.fullName = " + person.fullName);
        System.out.println("person.age = " + person.age);
        System.out.println("person.address = " + person.address);
    }
}
