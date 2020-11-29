package students.anna_tim.lesson_3.level_5.task_18;

class Dog {
    String dogName;

    Dog(String dogName) {
        this.dogName = dogName;
    }

    String getDogName() {
        return this.dogName;
    }

    void voice () {
        System.out.println("For voice command - name x 3: " + this.dogName + ", " + this.dogName + ", " + this.dogName);
    }
}
