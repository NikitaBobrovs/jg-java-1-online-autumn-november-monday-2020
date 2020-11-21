package students.nikita_bobrovs.lesson_3.level_5.task_18;

public class Dog {
    String name;
    String color;
    int age;

    Dog(String getName, int getAge, String getColor) {
        this.age = getAge;
        this.name = getName;
        this.color = getColor;
    }
    void happyBirthday() {
        this.age = this.age + 1;
    }
    void changeColor(String newColor){
        this.color = newColor;
    }

    void voice () {
            System.out.println
                    ("Hey, my name is " + this.name + ", i am " + this.age + " years old and i am "+this.color+"!");
            //for Task18 sout(this.name+" "+this.name+" "+this.name)
        }
}


class DogDemo{
    public static void main(String[] args) {
        Dog testDog = new Dog("Rex",3,"black");
        testDog.voice();                               //task 19
        System.out.println();

        testDog.happyBirthday();                       //Task20 - 21
        testDog.voice();
        System.out.println();

        testDog.changeColor("brown");         //Task 22
        testDog.voice();
        System.out.println();

        testDog.happyBirthday();
        testDog.changeColor("blue");          //Test
        testDog.voice();
    }
}
