package students.jekaterina_aleksejeva.lesson_8.level_1.task_3;

class Person {

    private String fullName;
    private int age;
    private Address address;

    public String getName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

}

class PersonDemo {
    public static void main(String[] args) {
        Person template = new Person();
        System.out.println("Physical person certificate: ");
        System.out.println("Name: " + template.getName());
        System.out.println("Age: " + template.getAge());
        System.out.println("Residence address: " + template.getAddress());
    }
}
