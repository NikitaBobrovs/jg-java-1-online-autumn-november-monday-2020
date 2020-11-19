package students.jana_sergejenko.lesson_3.level_5.task_20;

class Dog{

    String dogName;
    int dogAge;
    int newAge;

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
    void happyBirthday() {
        newAge=this.dogAge+1;
    }
    int newAge() {
        return newAge;
    }
}