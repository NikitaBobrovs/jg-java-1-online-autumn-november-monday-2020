package students.jana_sergejenko.lesson_8.level_1.task_3;

class Person {
    private String fullName;
    private int age;
    private Address address;

    // initialize age
    public void setAge(int age) {
        this.age = age;
    }

    // initialize name
    public void setName(String name) {
        this.fullName = name;
    }

    // initialize address
    public void setAddress(Address address) {
        this.address = address;
    }


    // access age
    public int getAge() {
        return this.age;
    }

    // access name
    public String getName() {
        return this.fullName;
    }

    // access address
    public Address getAddress() {
        return this.address;
    }

}
