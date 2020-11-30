package students.anna_tim.lesson_3.level_5.task_21;

class Dog {
    String dogName;
    int dogAge;
    String dogColour;


    Dog(String isDogName, int isDogAge, String isDogColour) {
        this.dogName = isDogName;
        this.dogAge = isDogAge;
        this.dogColour = isDogColour;
    }

    String getDogName() {
        return this.dogName;
    }

    int getDogAge() {
        return this.dogAge;
    }

    String getDogColour() {
        return this.dogColour;
    }

    void voice () {
        System.out.println("For voice command: name + age + colour = "+ this.dogName + " + " + this.dogAge + " + " + this.dogColour);
    }

    void happyBirthday() {
        this.dogAge = this.dogAge + 1;
        System.out.println("Now new age of Dog is "+this.dogAge+" yeas old");
    }

}
