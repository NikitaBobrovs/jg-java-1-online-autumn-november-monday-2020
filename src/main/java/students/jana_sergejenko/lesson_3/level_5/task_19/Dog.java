package students.jana_sergejenko.lesson_3.level_5.task_19;

class Dog{

    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    String getVoice() {
        return this.dogName;
    }
    int getAge() {
        return this.dogAge;
    }
}