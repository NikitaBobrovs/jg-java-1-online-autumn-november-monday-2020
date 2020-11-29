package students.anna_tim.lesson_3.level_4.task_19;

class Dog {
    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    String getDogName() {
        return this.dogName;
    }

    int getDogAge() {
        return this.dogAge;
    }

    void voice () {
        System.out.println("For voice command - name + age: " + this.dogName + " + " + this.dogAge + " years");
    }
}