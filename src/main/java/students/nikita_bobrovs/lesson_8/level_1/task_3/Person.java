package students.nikita_bobrovs.lesson_8.level_1.task_3;

class Person {
    private String fullName;
    private int age;
    private Address address;


    public static void main(String[] args) {
    Person person = new Person();
        System.out.println("Variable value from default constructor (age) = "+person.age);
        System.out.println("Variable value from default constructor (fullName) = "+person.fullName);
        System.out.println("Variable value from default constructor (address) = "+person.address);
    }
}
