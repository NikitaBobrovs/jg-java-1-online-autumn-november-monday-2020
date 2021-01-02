package students.polina_ivashkevich.lesson_8.level_1.task_3;

public class Person {
    private String fullName;
    private int age;
    private Address address;

    public void Name(String name){
        this.fullName = name;

    }
    public void Age(int age){
         this.age = age;
    }
    public void Address(Address address){
        this.address = address;
    }
    public String getName(){
        return this.fullName;
    }
    public int getAge(){
        return this.age;
    }
    public Address getAddress(){
        return this.address;
    }
}

class Address {

}
