package students.viktors_cesnokovs.lesson_3.level_7.task_29;

public class Bird {
    String name;
    String color;
    int age;

     public Bird(String name , String color , int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void changeName(String newName){ this.name = newName;}
    void changeColor (String newColor) {this.color = newColor;}
    void changeAge(int newAge) {this.age = newAge;}

    void printInfo(){
        System.out.println(this.name + " имеет "+ this.color + " окрас. Максимальный зарегистрированный возраст "+ this.age + " лет.");
    }
}




class BirdDemo{
    public static void main(String[] args) {
        Bird firstBird = new Bird("Домовой воробей","коричневый", 11);
        firstBird.printInfo();
        System.out.println();

        firstBird.changeName("Сизый голубь");
        firstBird.changeColor("пепельно-сизый");
        firstBird.changeAge(35);
        firstBird.printInfo();
    }
}