package students.anna_tim.lesson_3.level_5.task_20;

public class Dog {
    String dogName;
    int dogAge;


    Dog(String isDogName, int isDogAge) {
        this.dogName = isDogName;
        this.dogAge = isDogAge;
    }

    String getDogName() {
        return this.dogName;
    }

    int getDogAge() {
        return this.dogAge;
    }

    void voice () {
        System.out.println("For voice command: Wof");
    }

    /*public */ void happyBirthday() {
        this.dogAge = this.dogAge + 1;
        System.out.println("Now new age of Dog is "+this.dogAge+" yeas old");
    }

}
