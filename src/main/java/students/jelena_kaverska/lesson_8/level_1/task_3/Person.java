package students.jelena_kaverska.lesson_8.level_1.task_3;

class Person {
    private String fullName;
    private int age;
    private Address address;

    public String getFullName() {
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
        Person p = new Person();
        System.out.println(p.getFullName());
        System.out.println(p.getAge());
        System.out.println(p.getAddress());
    }
}