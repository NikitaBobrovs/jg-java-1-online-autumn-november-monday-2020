package students.viktors_cesnokovs.lesson_3.level_5.task_18;

public class Dog {
    String name;
    Dog(String name)
    {this.name = name;}

    public void voice(){
        System.out.println(this.name);
        System.out.println(this.name);
        System.out.println(this.name);
    }
}





 class DogDemo{
     public static void main(String[] args) {
         Dog myDog = new Dog("Rex");
         myDog.voice();
     }

}
